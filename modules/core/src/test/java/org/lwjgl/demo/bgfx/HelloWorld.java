/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.bgfx;

import java.io.IOException;
import java.nio.ByteBuffer;

import static org.lwjgl.bgfx.BGFX.*;

/**
 * bgfx demo: 25-C99
 *
 * <p>This demo is a Java port of
 * <a href="https://github.com/bkaradzic/bgfx/tree/master/examples/25-c99">https://github.com/bkaradzic/bgfx/tree/master/examples/25-c99</a>.</p>
 */
public class HelloWorld extends Demo {

	private ByteBuffer logo;

	public static void main(String[] args) {
		new HelloWorld().run(args);
	}

	private HelloWorld() {
		super("25-C99");
	}

	@Override
	protected void create() throws IOException {
		logo = Logo.createLogo();
	}

	@Override
	protected void frame(float time, float frameTime) {
		bgfx_dbg_text_image(Math.max(getWindowWidth()/2/8, 20)-20,
		                    Math.max(getWindowHeight()/2/16, 6)-6,
		                    40,
		                    12,
		                    logo,
		                    160);

		bgfx_dbg_text_printf(0,
		                     1,
		                     0x4f,
		                     "bgfx/examples/25-c99");

		bgfx_dbg_text_printf(0,
		                     2,
		                     0x6f,
		                     "Description: Initialization and debug text with C99 API.");
	}

	@Override
	protected void dispose() {
	}

}
