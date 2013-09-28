/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system;

import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.List;

import com.sun.javadoc.*;
import com.sun.tools.doclets.standard.Standard;
import com.sun.tools.javadoc.Main;

/**
 * Custom Doclet that adds support for the {@code @JavadocExclude} annotation. Elements annotated with {@code @JavadocExclude} will be ignored during javadoc
 * generation.
 * <p/>
 * Originally written by Chris Nokleberg and released in the public domain.
 *
 * @see <a href="http://www.sixlegs.com/blog/java/exclude-javadoc-tag.html">Chris Nokleberg's Fizzy Weblog</a>
 */
public final class ExcludeDoclet {

	private ExcludeDoclet() {
	}

	public static void main(String[] args) {
		String name = ExcludeDoclet.class.getName();
		Main.execute(name, name, args);
	}

	public static boolean validOptions(String[][] options, DocErrorReporter reporter) throws java.io.IOException {
		return Standard.validOptions(options, reporter);
	}

	public static int optionLength(String option) {
		return Standard.optionLength(option);
	}

	public static boolean start(RootDoc root) throws java.io.IOException {
		return Standard.start((RootDoc)process(root, RootDoc.class));
	}

	private static boolean shouldExclude(AnnotationDesc[] annotations) {
		for ( AnnotationDesc ad : annotations ) {
			if ( "org.lwjgl.system.JavadocExclude".equals(ad.annotationType().qualifiedName()) )
				return true;
		}
		return false;
	}

	private static boolean shouldExclude(Object doc) {
		if ( doc instanceof ProgramElementDoc )
			return shouldExclude(((ProgramElementDoc)doc).annotations());
		else if ( doc instanceof PackageDoc )
			return shouldExclude(((PackageDoc)doc).annotations());

		return false;
	}

	private static Object process(Object obj, Class expect) {
		if ( obj == null )
			return null;

		Class cls = obj.getClass();
		if ( cls.getName().startsWith("com.sun.") ) {
			return Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), new ExcludeHandler(obj));
		} else if ( obj instanceof Object[] ) {
			Class componentType = expect.getComponentType();
			if ( componentType == null )
				return obj;

			Object[] entries = (Object[])obj;
			List<Object> processed = new ArrayList<Object>(entries.length);

			for ( Object entry : entries ) {
				if ( shouldExclude(entry) )
					continue;

				processed.add(process(entry, componentType));
			}

			return processed.toArray((Object[])Array.newInstance(componentType, processed.size()));
		} else {
			return obj;
		}
	}

	private static class ExcludeHandler
		implements InvocationHandler {
		private Object target;

		ExcludeHandler(Object target) {
			this.target = target;
		}

		@Override
		public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
			if ( args != null ) {
				String methodName = method.getName();
				if ( "compareTo".equals(methodName) || "equals".equals(methodName) || "overrides".equals(methodName) || "subclassOf".equals(methodName) )
					args[0] = unwrap(args[0]);
			}

			try {
				return process(method.invoke(target, args), method.getReturnType());
			} catch (InvocationTargetException e) {
				throw e.getTargetException();
			}
		}

		private static Object unwrap(Object proxy) {
			if ( proxy instanceof Proxy )
				return ((ExcludeHandler)Proxy.getInvocationHandler(proxy)).target;

			return proxy;
		}
	}

}