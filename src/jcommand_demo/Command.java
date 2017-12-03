package jcommand_demo;

/*
 * Each Command will be used by calling
 *  CommandObject.execute();
 */
public interface Command {
	public void execute();
}
