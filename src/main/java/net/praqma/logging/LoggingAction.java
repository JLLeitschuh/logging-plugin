package net.praqma.logging;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.List;

import hudson.model.Action;

public class LoggingAction implements Action {

	private transient LoggingStream loggingStream;
	private transient List<LoggerTarget> targets;

	public LoggingAction( FileOutputStream out, List<LoggerTarget> targets ) {
		loggingStream = new LoggingStream( out );
		this.targets = targets;
	}

	public OutputStream getOut() {
		return loggingStream.getOutputStream();
	}

	public LoggingStream getLoggingStream() {
		return loggingStream;
	}
	
	public List<LoggerTarget> getTargets() {
		return targets;
	}

	@Override
	public String getDisplayName() {
		return null;
	}

	@Override
	public String getIconFileName() {
		return null;
	}

	@Override
	public String getUrlName() {
		return null;
	}

}