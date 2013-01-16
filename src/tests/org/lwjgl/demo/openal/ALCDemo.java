/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.demo.openal;

import org.lwjgl.openal.ALC;
import org.lwjgl.openal.ALCCapabilities;

import java.util.List;

import static org.lwjgl.openal.ALC10.*;
import static org.lwjgl.openal.ALC11.*;

public class ALCDemo {

	private ALCDemo() {
	}

	public static void main(String[] args) {
		final ALCCapabilities caps = ALC.getCapabilities();

		System.out.println("OpenALC10: " + caps.OpenALC10);
		System.out.println("OpenALC11: " + caps.OpenALC11);

		final String defaultDeviceSpecifier = alcGetString(0L, ALC_DEFAULT_DEVICE_SPECIFIER);

		System.out.println("Default device: " + defaultDeviceSpecifier);

		final long device = alcOpenDevice(defaultDeviceSpecifier);

		if ( caps.OpenALC11 ) {
			List<String> devices = ALC.getStringList(0L, ALC_ALL_DEVICES_SPECIFIER);
			for ( int i = 0; i < devices.size(); i++ ) {
				System.out.println(i + ": " + devices.get(i));
			}
		}

		alcCloseDevice(device);
	}

}