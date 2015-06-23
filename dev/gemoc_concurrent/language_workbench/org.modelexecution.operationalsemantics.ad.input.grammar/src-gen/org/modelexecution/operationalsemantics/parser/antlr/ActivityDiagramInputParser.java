/*
* generated by Xtext
*/
package org.modelexecution.operationalsemantics.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.modelexecution.operationalsemantics.services.ActivityDiagramInputGrammarAccess;

public class ActivityDiagramInputParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private ActivityDiagramInputGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.modelexecution.operationalsemantics.parser.antlr.internal.InternalActivityDiagramInputParser createParser(XtextTokenStream stream) {
		return new org.modelexecution.operationalsemantics.parser.antlr.internal.InternalActivityDiagramInputParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Input";
	}
	
	public ActivityDiagramInputGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ActivityDiagramInputGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}