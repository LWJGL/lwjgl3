/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.demo.util;

import org.lwjgl.BufferUtils;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;
import java.awt.image.SampleModel;
import java.awt.image.WritableRaster;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import javax.imageio.ImageIO;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.ImageTypeSpecifier;
import javax.imageio.stream.ImageInputStream;

import static org.lwjgl.BufferUtils.*;

public final class IOUtil {

	private IOUtil() {
	}

	private static ByteBuffer resizeBuffer(ByteBuffer buffer, int newCapacity) {
		ByteBuffer newBuffer = BufferUtils.createByteBuffer(newCapacity);
		buffer.flip();
		newBuffer.put(buffer);
		return newBuffer;
	}

	/**
	 * Reads the specified resource and returns the raw data as a ByteBuffer.
	 *
	 * @param resource   the resource to read
	 * @param bufferSize the initial buffer size
	 *
	 * @return the resource data
	 *
	 * @throws IOException if an IO error occurs
	 */
	public static ByteBuffer ioResourceToByteBuffer(String resource, int bufferSize) throws IOException {
		ByteBuffer buffer = createByteBuffer(bufferSize);

		URL sourceURL = Thread.currentThread().getContextClassLoader().getResource(resource);
		if ( sourceURL == null )
			throw new FileNotFoundException(resource);

		InputStream source = sourceURL.openStream();
		try {
			ReadableByteChannel rbc = Channels.newChannel(source);
			try {
				while ( true ) {
					int bytes = rbc.read(buffer);
					if ( bytes == -1 )
						break;
					if ( buffer.remaining() == 0 )
						buffer = resizeBuffer(buffer, buffer.capacity() * 2);
				}
			} finally {
				rbc.close();
			}
		} finally {
			source.close();
		}

		buffer.flip();
		return buffer;
	}

	/**
	 * Reads the specified resource and returns the raw image data as a ByteBuffer.
	 *
	 * @param file the image resource to read
	 *
	 * @return the image data
	 *
	 * @throws IOException if an IO error occurs
	 */
	public static ImageData ioImageResourceToByteBuffer(String file) throws IOException {
		URL sourceURL = Thread.currentThread().getContextClassLoader().getResource(file);
		if ( sourceURL == null )
			throw new FileNotFoundException(file);

		ImageInputStream input = ImageIO.createImageInputStream(sourceURL.openStream());
		try {
			ImageReader reader = ImageIO.getImageReaders(input).next();
			try {
				reader.setInput(input);

				int width = reader.getWidth(0);
				int height = reader.getHeight(0);

				ImageTypeSpecifier type = reader.getImageTypes(0).next();
				SampleModel sm = type.getColorModel().createCompatibleSampleModel(width, height);

				final ByteBuffer pixels = createByteBuffer(width * height * sm.getNumDataElements());

				ImageReadParam param = reader.getDefaultReadParam();
				param.setDestination(new BufferedImage(type.getColorModel(), new ByteBufferWritableRaster(
					sm,
					new DataBuffer(sm.getTransferType(), pixels.capacity(), 1) {
						@Override
						public int getElem(int bank, int i) {
							return pixels.get(i);
						}

						@Override
						public void setElem(int bank, int i, int val) {
							pixels.put(i, (byte)(val & 0xFF));
						}
					},
					new Point()
				), type.getColorModel().isAlphaPremultiplied(), null));

				reader.read(0, param);

				return new ImageData(width, height, pixels);
			} finally {
				reader.dispose();
			}
		} finally {
			input.close();
		}
	}

	public static class ImageData {
		public final int        width;
		public final int        height;
		public final ByteBuffer data;

		public ImageData(int width, int height, ByteBuffer data) {
			this.width = width;
			this.height = height;
			this.data = data;
		}
	}

	private static class ByteBufferWritableRaster extends WritableRaster {
		ByteBufferWritableRaster(SampleModel model, DataBuffer buffer, Point origin) {
			super(model, buffer, origin);
		}
	}

}