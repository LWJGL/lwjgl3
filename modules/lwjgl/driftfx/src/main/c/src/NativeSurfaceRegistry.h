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
#ifndef DRIFTFX_INTERNAL_NATIVESURFACEREGISTRY_H_
#define DRIFTFX_INTERNAL_NATIVESURFACEREGISTRY_H_

#include <map>
#include <mutex>

#include <jni.h>

#include "NativeSurface.h"
#include "JNINativeSurface.h"

namespace driftfx {
namespace internal {

class NativeSurfaceRegistry {

public:
	long Create(JNINativeSurface *api);
	void Destroy(long surfaceid);
	NativeSurface* Get(long surfaceId);

	static NativeSurfaceRegistry* Get();

private:
	NativeSurfaceRegistry();
	virtual ~NativeSurfaceRegistry();

	static NativeSurfaceRegistry* instance;

	long nextSurfaceId;
	std::mutex mutex;
	std::map<long, NativeSurface*> registry;
};

}
}

#endif /* DRIFTFX_INTERNAL_NATIVESURFACEREGISTRY_H_ */
