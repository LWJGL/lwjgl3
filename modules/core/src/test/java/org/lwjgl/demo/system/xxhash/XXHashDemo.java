/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.demo.system.xxhash;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.Random;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.xxhash.XXHash.*;
import static org.testng.Assert.*;

public final class XXHashDemo {

	private XXHashDemo() {
	}

	public static void main(String[] args) {
		ByteBuffer buffer = memAlloc(128);
		Random rand = new Random(13);
		for ( int i = 0; i < buffer.capacity(); i++ )
			buffer.put(i, (byte)(rand.nextInt() & 0xFF));

		int SEED = 7;

		// simple functions
		int hash32 = XXH32(buffer, SEED);
		long hash64 = XXH64(buffer, SEED);

		assertEquals(hash32, 0xC5C8C208);
		assertEquals(hash64, 0x656D889F290F0BCCL);

		System.out.format("test %d-bit hash = 0x%X\n", 32, hash32);
		System.out.format("test %d-bit hash = 0x%X\n", 64, hash64);

		// streaming hash with advanced functions
		try {
			String resource = "lwjgl32.png";
			InputStream stream = Thread.currentThread().getContextClassLoader().getResourceAsStream(resource);
			try {
				ReadableByteChannel rbc = Channels.newChannel(stream);

				// init
				long state = XXH64_createState();
				XXH64_reset(state, SEED);
				try {
					while ( true ) {
						buffer.clear();
						int bytes = rbc.read(buffer);
						if ( bytes == -1 )
							break;

						// stream update
						buffer.flip();
						XXH64_update(state, buffer);
					}
					// digest
					hash64 = XXH64_digest(state);
					System.out.format("streaming 64-bit hash: 0x%X (%s)\n", hash64, resource);
				} finally {
					XXH64_freeState(state);
					rbc.close();
				}
			} finally {
				stream.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			memFree(buffer);
		}
	}

}