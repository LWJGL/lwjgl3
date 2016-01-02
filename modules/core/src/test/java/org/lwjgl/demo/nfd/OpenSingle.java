/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.demo.nfd;

import org.lwjgl.PointerBuffer;

import static org.lwjgl.nfd.NativeFileDialog.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Open a single file with NativeFileDialog. */
public final class OpenSingle {

	private OpenSingle() {
	}

	public static void main(String[] args) {
		PointerBuffer outPath = memAllocPointer(1);

		try {
			int result = NFD_OpenDialog("pnf,jpg;pdf", null, outPath);
			switch ( result ) {
				case NFD_OKAY:
					System.out.println("Success!");
					System.out.println(outPath.getStringUTF8(0));
					nNFD_Free(outPath.get(0));
					break;
				case NFD_CANCEL:
					System.out.println("User pressed cancel.");
					break;
				default: // NFD_ERROR
					System.err.format("Error: %s\n", NFD_GetError());
			}
		} finally {
			memFree(outPath);
		}
	}

}