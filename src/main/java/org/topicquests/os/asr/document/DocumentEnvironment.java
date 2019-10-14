/**
 * 
 */
package org.topicquests.os.asr.document;


import org.topicquests.os.asr.AsrCoreEnvironment;
import org.topicquests.os.asr.document.api.IDocumentAgent;
import org.topicquests.support.api.IEnvironment;

/**
 * @author jackpark
 *
 */
public class DocumentEnvironment extends AsrCoreEnvironment {
	private IDocumentAgent agent;
	/**
	 * 
	 */
	public DocumentEnvironment() {
		IEnvironment env = this;
		agent = new DocumentAgent(this);
		
		
		Runtime.getRuntime().addShutdownHook(new Thread() {
			
			@Override
			public void run() {
				shutDown();
			}
		});

	}
	

	public IDocumentAgent getDocumentAgent() {
		return agent;
	}
	
	public void shutDown() {
		super.shutDown();
		agent.shutDown();
	}

}
