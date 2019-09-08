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


#include <DriftFX/Texture.h>
using namespace driftfx;

Texture::Texture(unsigned int width, unsigned int height) :
	width(width),
	height(height) {

}

Texture::~Texture() noexcept(false) {

}

unsigned int Texture::GetWidth() {
	return width;
}

unsigned int Texture::GetHeight() {
	return height;
}

