package javapython;

import org.python.util.PythonInterpreter;

public class TestePython {
	 public static void main(String[] args) {
		    try(PythonInterpreter pyInterp = new PythonInterpreter()) {
		      //pyInterp.exec("print('Hello Python World!')");
		    	pyInterp.execfile("C:\\Users\\rafae\\eclipse-workspace\\javapython\\Python\\hello.py");
		    }
		  }
		}