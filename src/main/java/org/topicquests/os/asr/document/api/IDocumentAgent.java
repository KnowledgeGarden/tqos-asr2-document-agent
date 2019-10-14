/**
 * 
 */
package org.topicquests.os.asr.document.api;

import org.topicquests.support.api.IResult;

/**
 * @author jackpark
 *
 */
public interface IDocumentAgent {
	
	/**
	 * Return an IDocument's JSON object subject to the following:<br/>
	 * The document is fresh and not being processed by any agent
	 * @return
	 */
	IResult getUnique();
	
	/**
	 * Return an IDocument's JSON object as identified by <code>documentId</code>
	 * @param documentId
	 * @return
	 */
	IResult getID(String documentId);
	
	void shutDown();

}
