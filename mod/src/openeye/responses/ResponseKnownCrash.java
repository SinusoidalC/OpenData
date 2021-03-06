package openeye.responses;

import openeye.logic.IContext;
import openeye.notes.NoteCollector;

import com.google.gson.annotations.SerializedName;

public class ResponseKnownCrash implements IResponse {
	public static final String TYPE = "known_crash";

	@Override
	public String getType() {
		return TYPE;
	}

	@SerializedName("note")
	public String note;

	@SerializedName("url")
	public String url;

	@Override
	public void execute(IContext context) {
		NoteCollector.INSTANCE.addNote(this);
	}
}
