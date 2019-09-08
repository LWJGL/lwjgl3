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

#include "../Common.h"
#include <DriftFX/GL/GLContext.h>
#include <DriftFX/GL/GLTexture.h>

#include <iostream>
using namespace std;

using namespace driftfx;
using namespace driftfx::gl;

Texture* GLContext::CreateTexture(int width, int height) {
	return new GLTexture(this, width, height);
}
