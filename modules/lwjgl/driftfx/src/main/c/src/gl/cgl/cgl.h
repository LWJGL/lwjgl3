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
#ifndef _CGL_H
#define _CGL_H

#include <OpenGL/CGLTypes.h>
#include <IOSurface/IOSurface.h>
#include <string>

extern "C" void* getCGLContextObj(void* nsJContext);
extern "C" IOSurfaceRef createIOSurface(int width, int height);
extern "C" void releaseIOSurface(IOSurfaceRef ioSurface);

#endif
