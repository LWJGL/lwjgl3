/*
 * Copyright (c) 2019 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Christoph Caks <ccaks@bestsolution.at> - initial API and implementation
 */
#include "cgl.h"

#include <OpenGL/OpenGL.h>
#include <OpenGL/CGLContext.h>
#include <OpenGL/CGLTypes.h>
#include <OpenGL/CGLDevice.h>

#include <iostream>
#include <string>

using namespace std;

#include <IOSurface/IOSurface.h>

IOSurfaceRef createIOSurface(int width, int height) {

	int bpe = 4;

	CFStringRef keys[3];
	keys[0] = kIOSurfaceWidth;
	keys[1] = kIOSurfaceHeight;
	keys[2] = kIOSurfaceBytesPerElement;
	CFNumberRef values[3];
	values[0] = CFNumberCreate(kCFAllocatorDefault, kCFNumberIntType, &width);
	values[1] = CFNumberCreate(kCFAllocatorDefault, kCFNumberIntType, &height);
	values[2] = CFNumberCreate(kCFAllocatorDefault, kCFNumberIntType, &bpe);

	CFDictionaryRef dict;
	dict = CFDictionaryCreate(NULL, (const void**)keys, (const void**)values, 3, &kCFCopyStringDictionaryKeyCallBacks, &kCFTypeDictionaryValueCallBacks);

	//CFShow(dict0);

	IOSurfaceRef ioSurface = IOSurfaceCreate(dict);
	CFRelease(dict);
	return ioSurface;
}

void releaseIOSurface(IOSurfaceRef ioSurface) {
	CFRelease(ioSurface);
}
