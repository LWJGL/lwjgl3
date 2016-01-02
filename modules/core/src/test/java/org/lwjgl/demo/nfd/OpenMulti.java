/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.demo.nfd;

import org.lwjgl.nfd.NFDPathSet;

import static org.lwjgl.nfd.NativeFileDialog.*;

/** Open multiple files with NativeFileDialog. */
public final class OpenMulti {

	private OpenMulti() {
	}

	public static void main(String[] args) {
		NFDPathSet pathSet = NFDPathSet.calloc();

		try {
			int result = NFD_OpenDialogMultiple("png,jpg;pdf", null, pathSet);
			switch ( result ) {
				case NFD_OKAY:
					long count = NFD_PathSet_GetCount(pathSet);
					for ( long i = 0; i < count; i++ ) {
						String path = NFD_PathSet_GetPath(pathSet, i);
						System.out.format("Path %d: %s\n", i, path);
					}
					NFD_PathSet_Free(pathSet);
					break;
				case NFD_CANCEL:
					System.out.println("User pressed cancel.");
					break;
				default: // NFD_ERROR
					System.err.format("Error: %s\n", NFD_GetError());
			}
		} finally {
			pathSet.free();
		}
	}

}