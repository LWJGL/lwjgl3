/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.demo.util.xxhash;

import org.lwjgl.system.MemoryStack;
import org.lwjgl.util.xxhash.XXH64State;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.Random;

import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.util.xxhash.XXHash.*;
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
		String resource = "lwjgl32.png";
		try {
			// Allocate and free using the API
			XXH64State state = XXH64_createState();
			try {
				hash64 = streamingHash(buffer, resource, state, SEED);
				System.out.format("streaming 64-bit hash: 0x%X (%s, malloc)\n", hash64, resource);
			} finally {
				XXH64_freeState(state);
			}

			// Using stack allocation
			try ( MemoryStack stack = stackPush() ) {
				state = XXH64State.mallocStack(stack);
				hash64 = streamingHash(buffer, resource, state, SEED);
				System.out.format("streaming 64-bit hash: 0x%X (%s, stack)\n", hash64, resource);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			memFree(buffer);
		}
	}

	private static long streamingHash(ByteBuffer buffer, String resource, XXH64State state, int SEED) throws IOException {
		// init
		XXH64_reset(state, SEED);
		try (
			InputStream stream = Thread.currentThread().getContextClassLoader().getResourceAsStream(resource);
			ReadableByteChannel rbc = Channels.newChannel(stream)
		) {
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
			return XXH64_digest(state);
		}
	}

}