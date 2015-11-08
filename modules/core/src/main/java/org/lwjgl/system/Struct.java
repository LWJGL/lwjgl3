/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system;

import java.nio.ByteBuffer;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Base class of all struct implementations. */
public abstract class Struct extends PointerWrapper {

	static {
		Library.initialize();
	}

	private final ByteBuffer container;

	protected Struct(long address, ByteBuffer container, int sizeof) {
		super(address);

		if ( Checks.CHECKS && container != null )
			checkBuffer(container, sizeof);

		this.container = container;
	}

	/** Returns the {@code sizeof(struct)}. */
	public abstract int sizeof();

	/** Zeroes-out the struct data. */
	public void clear() {
		memSet(address(), 0, sizeof());
	}

	/**
	 * Frees the struct allocation.
	 *
	 * <p>This method should not be used if the memory backing this struct is not owned by the struct.</p>
	 */
	public void free() {
		nmemFree(address());
	}

}