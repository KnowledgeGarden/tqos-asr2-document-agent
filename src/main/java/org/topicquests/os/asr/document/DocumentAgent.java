/**
 * 
 */
package org.topicquests.os.asr.document;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.topicquests.backside.kafka.consumer.api.IMessageConsumerListener;
import org.topicquests.ks.kafka.KafkaConsumer;
import org.topicquests.ks.kafka.KafkaProducer;
import org.topicquests.os.asr.document.api.IDocumentAgent;
import org.topicquests.os.asr.document.api.IDocumentConstants;
import org.topicquests.support.api.IResult;

/**
 * @author jackpark
 *
 */
public class DocumentAgent implements IDocumentAgent, IMessageConsumerListener	 {
	private DocumentEnvironment environment;
	private KafkaConsumer kConsumer;
	private KafkaProducer kProducer;

	/**
	 * @param env
	 */
	public DocumentAgent(DocumentEnvironment env) {
		environment = env;
		kConsumer = new KafkaConsumer(env, IDocumentConstants.KAFKA_CONSUMER_CLIENT_NAME, this);
		kProducer = new KafkaProducer(env, IDocumentConstants.KAFKA_PRODUCER_CLIENT_NAME);
	}

	/* (non-Javadoc)
	 * @see org.topicquests.os.asr.document.api.IDocumentAgent#getUnique()
	 */
	@Override
	public IResult getUnique() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.topicquests.os.asr.document.api.IDocumentAgent#getID(java.lang.String)
	 */
	@Override
	public IResult getID(String documentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean acceptRecord(ConsumerRecord record) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void shutDown() {
		kProducer.close();
	}

}
