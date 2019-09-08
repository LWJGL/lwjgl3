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

#ifndef DRIFTFX_MATH_VEC2_H_
#define DRIFTFX_MATH_VEC2_H_

#include <DriftFX/Common.h>

namespace driftfx {
namespace math {
	/*
	struct DRIFT_API Vec2ui {
		unsigned int x;
		unsigned int y;
		Vec2ui() : x(0), y(0) {}
		Vec2ui(unsigned int x, unsigned int y) : x(x), y(y) {}
	};

	struct DRIFT_API Vec2d {
		double x;
		double y;
		Vec2d() : x(0), y(0) {}
		Vec2d(double x, double y) : x(x), y(y) {}
	};
	*/
template <typename T>
struct DRIFT_API Vec2 {
	T x;
	T y;
	Vec2() : x(0), y(0) {}
	Vec2(T x, T y) : x(x), y(y) {}
};

typedef Vec2<int> Vec2i;
typedef Vec2<unsigned int> Vec2ui;
typedef Vec2<double> Vec2d;

}
}

#endif //DRIFTFX_MATH_VEC2_H_