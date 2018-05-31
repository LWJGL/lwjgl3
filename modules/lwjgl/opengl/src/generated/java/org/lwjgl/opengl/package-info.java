/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */

/**
 * Contains bindings to the <a target="_blank" href="https://www.opengl.org/">OpenGL</a> cross-platform 2D and 3D rendering API.
 * 
 * <p>The <a target="_blank" href="https://www.khronos.org/registry/OpenGL/index_gl.php">OpenGL registry</a> is a useful online resource that contains the OpenGL and OpenGL
 * Shading Language specifications, as well as specifications of OpenGL extensions.
 * The <a target="_blank" href="https://www.khronos.org/registry/OpenGL-Refpages/">OpenGL Reference Pages</a> is another convenient source of documentation.</p>
 * 
 * <p>The bindings of the core OpenGL functionality are contained in two distinct class hierarchies:</p>
 * 
 * <ul>
 * <li>{@code GL11..GL46}: all symbols of the Compatibility Profile are included</li>
 * <li>{@code GL11C..GL46C}: only symbols of the Core Profile are included</li>
 * </ul>
 * 
 * <p>Each of the above classes extends the class of the previous OpenGL version in the corresponding hierarchy.</p>
 * 
 * <p>The recommended way to write OpenGL applications with LWJGL is to statically import the class that corresponds to the minimum required OpenGL version.
 * This will expose all symbols up to that version. Additional functionality (later core versions or extensions) should be guarded with appropriate checks
 * using the {@link org.lwjgl.opengl.GLCapabilities GLCapabilities} instance of the OpenGL context.</p>
 * 
 * <p>The Compatibility Profile and Core Profile class hierarchies should not be mixed with static imports, as that would result in compilation ambiguities
 * when resolving the symbols. Note that the Compatibility Profile hierarchy can be used with a Core Profile context (as long as no deprecated symbol is
 * used) and the Core Profile hierarchy can be used with a Compatibility Profile context. The recommendation is to use the Compatibility Profile hierarchy
 * only when deprecated functionality is required. In any other case, the Core Profile hierarchy should be preferred.</p>
 * 
 * <p>For example, an OpenGL application that requires OpenGL 3.3, must use modern OpenGL features only and needs the best possible performance:</p>
 * 
 * <ul>
 * <li>Should create a 3.3 Compatibility Profile context. A Core Profile context would have extra validation overhead.</li>
 * <li>Should use the Core Profile hierarchy to avoid deprecated symbols. Auto-complete lists in an IDE will also be cleaner.</li>
 * </ul>
 */
@org.lwjgl.system.NonnullDefault
package org.lwjgl.opengl;

