/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.demo.util;

import org.lwjgl.system.libffi.Closure;
import org.lwjgl.system.libffi.ClosureRegistry;

import java.util.ArrayList;
import java.util.List;

/** Experimental ClosureRegistry, do not use in production. */
public class ClosureGC implements ClosureRegistry {

	private static final class ClosureGCLoader {
		private static final ClosureGC INSTANCE = new ClosureGC();
	}

	private final ThreadLocal<Stack> stacks = new ThreadLocal<Stack>() {
		@Override
		protected Stack initialValue() {
			return new Stack();
		}
	};

	public ClosureGC() {
	}

	public static ClosureGC get() {
		return ClosureGCLoader.INSTANCE;
	}

	@Override
	public void register(Closure closure) {
		stacks.get().register(closure);
	}

	/** Releases all Closures that were allocated at the current stack depth. */
	public void gc() {
		stacks.get().gc();
	}

	/** Stores the current stack level makes a new level. */
	public void push() {
		stacks.get().push();
	}

	/** Releases all Closures that were allocated at the current stack depth and restores the previously pushed level. */
	public void pop() {
		stacks.get().pop();
	}

	private static class Stack {

		private static final int
			INIT_DEPTH = 4,
			INIT_SIZE  = 8;

		private int depth;

		private List<List<Closure>> stack;

		Stack() {
			stack = new ArrayList<List<Closure>>(INIT_DEPTH);
			for ( int i = 0; i < INIT_DEPTH; i++ )
				stack.add(new ArrayList<Closure>(INIT_SIZE));
		}

		void register(Closure closure) {
			stack.get(depth).add(closure);
		}

		void gc() {
			List<Closure> level = stack.get(depth);
			for ( Closure closure : level )
				closure.release();
			level.clear();
		}

		void push() {
			if ( depth == stack.size() - 1 )
				increaseDepth();

			depth++;
		}

		private void increaseDepth() {
			List<List<Closure>> newStack = new ArrayList<List<Closure>>(stack.size() << 1);
			newStack.addAll(stack);
			for ( int i = stack.size(); i < newStack.size(); i++ )
				newStack.add(new ArrayList<Closure>(INIT_SIZE));
			stack = newStack;
		}

		void pop() {
			if ( depth == 0 )
				throw new IllegalStateException("The closure stack is already at the top level");

			gc();
			depth--;
		}

	}

}