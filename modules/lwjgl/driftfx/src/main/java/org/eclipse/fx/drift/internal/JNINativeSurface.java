/*******************************************************************************
 * Copyright (c) 2019 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Christoph Caks <ccaks@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.drift.internal;

import java.util.function.Consumer;

public class JNINativeSurface {

	private Consumer<Frame> framePresenter;
	
	public JNINativeSurface(Consumer<Frame> framePresenter) {
		this.framePresenter = framePresenter;
	}
	
	// Important: called from native code
	public void present(Frame frame) {
		framePresenter.accept(frame);
	}
	
}
