/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.demo.nfd;

import org.lwjgl.PointerBuffer;

import static org.lwjgl.nfd.NativeFileDialog.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Save a file with NativeFileDialog. */
public final class Save {

	private Save() {
	}

	public static void main(String[] args) {
		PointerBuffer savePath = memAllocPointer(1);

		try {
			int result = NFD_SaveDialog("png,jpg;pdf", null, savePath);
			switch ( result ) {
				case NFD_OKAY:
					System.out.println("Success!");
					System.out.println(savePath.getStringUTF8(0));
					nNFD_Free(savePath.get(0));
					break;
				case NFD_CANCEL:
					System.out.println("User pressed cancel.");
					break;
				default: // NFD_ERROR
					System.err.format("Error: %s\n", NFD_GetError());
			}
		} finally {
			memFree(savePath);
		}
	}

}