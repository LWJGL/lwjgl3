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

public class Log {

	public static void debug(String msg) {
		if (Configuration.LOGLEVEL <= 0) {
			System.out.println("[J] [DEBUG] " + msg);
		}
	}

	public static void info(String msg) {
		if (Configuration.LOGLEVEL <= 1) {
			System.out.println("[J] [INFO ] " + msg);
		}
	}

	public static void error(String msg) {
		if (Configuration.LOGLEVEL <= 2) {
			System.out.println("[J] [ERROR] " + msg);
		}
	}

}
