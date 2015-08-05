package es.alonso.ann.playground.perceptron;

import org.encog.Encog;
import org.encog.engine.network.activation.ActivationSigmoid;
import org.encog.ml.data.MLDataSet;
import org.encog.ml.data.basic.BasicMLDataSet;
import org.encog.neural.networks.BasicNetwork;
import org.encog.neural.networks.layers.BasicLayer;
import org.encog.util.simple.EncogUtility;

/**
 * AND: Using a basic multi-layer perceptron calculates the result of the AND operator
 */
public class PerceptronAND {
	/**
	 * The input necessary for XOR.
	 */
	public static double AND_INPUT[][] = { { 0.0, 0.0 }, { 1.0, 0.0 }, { 0.0, 1.0 }, { 1.0, 1.0 }};
 
	/**
	 * The ideal data necessary for XOR.
	 */
	public static double AND_IDEAL[][] = { { 0.0 }, { 0.0 }, { 0.0 }, { 1.0 }};
 
	
	// The training set works this way
	// AND_INPUT	AND_IDEAL
	// 0	0		0
	// 0	1		0
	// 1	0		0
	// 1	1		1
	
	/**
	 * The main method.
	 * @param args No arguments are used.
	 */
	public static void main(final String args[]) {
 
		// create a neural network, without using a factory
		BasicNetwork network = new BasicNetwork();
		network.addLayer(new BasicLayer(null,true,2));
		// Sigmoid activation functions goes from 0 to 1
		network.addLayer(new BasicLayer(new ActivationSigmoid(),true,5));
		network.addLayer(new BasicLayer(new ActivationSigmoid(),false,1));
		network.getStructure().finalizeStructure();
		network.reset();
 
		// create training data
		MLDataSet trainingSet = new BasicMLDataSet(AND_INPUT, AND_IDEAL);
 
	    // train to 1%
	    EncogUtility.trainToError(network, trainingSet, 0.01);
	    // evaluate
	    EncogUtility.evaluate(network, trainingSet);
	    
		Encog.getInstance().shutdown();
	}
}