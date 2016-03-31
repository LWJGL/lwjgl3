/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system

import org.lwjgl.generator.*
import java.io.PrintWriter

private val CLASS = "ThreadLocalState"

object ThreadLocalState : GeneratorTarget("org.lwjgl.system", CLASS) {
	override fun PrintWriter.generateJava() {
		print(HEADER)
		println("package $packageName;\n")

		Generator.tlsImport.forEach {
			javaImport(it)
		}

		preamble.printJava(this)

		println("""/** Thread-local state used internally by LWJGL. */
public final class $CLASS implements Runnable {

	Runnable target;

	public final MemoryStack stack;
""")

		Generator.tlsState.forEach {
			println("\t$it")
		}

		println("""
	$CLASS() {
		stack = MemoryStack.create();
	}

	@Override
	public void run() {
		if ( target != null )
			target.run();
	}

}""")
	}
}