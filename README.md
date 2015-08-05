# Implemented Artificial Neural Networks
## Available implementations
This is the first multi-layer network developed. It allows to train **hidden layers** between the input layer and the output layer.
   * **BackPropagationXOR**: Solves the XOR problem using backpropagation with a sigmoid activation function (values from 0 to 1)
   * **PerceptronAND**: Solves the AND operator using a simple multi-layer perceptron. Back propagation fails solving this simple problem
   * **AdalineDigits**: Solves a very simple pattern recognition only if they are exactly as the ones used for training. See [1].
   * **HopfieldAssociate**: Solves a more complex pattern recognition, even if the patterns checked are not exactly as the ones used for training. See [1].
   
## Notes
[1] On a pattern recognition problem, the neural network must have as many neurons as the pattern width*height representation
