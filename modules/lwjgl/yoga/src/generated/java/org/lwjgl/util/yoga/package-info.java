/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */

/**
 * Contains bindings to <a target="_blank" href="https://facebook.github.io/yoga/">Yoga</a>.
 * 
 * <p>Yoga is a cross-platform layout engine enabling maximum collaboration within your team by implementing an API familiar to many designers and opening it
 * up to developers across different platforms.</p>
 * 
 * <ul>
 * <li>Do you already know Flexbox? Then you already know Yoga.</li>
 * <li>Write code in a language familiar to you - Java, C#, Objective-C, C.</li>
 * <li>C under the hood so your code moves fast.</li>
 * <li>Battle tested in popular frameworks like React Native.</li>
 * </ul>
 * 
 * <h3>LWJGL implementation</h3>
 * 
 * <p>Unlike the official Yoga Java bindings, the LWJGL bindings directly expose the native C API. {@code YGNodeRef} handles do not need to be wrapped in Java
 * instances, so there is no memory overhead. The internal Yoga structs are also exposed, which makes it very efficient to read the current tree layout
 * after a call to {@link org.lwjgl.util.yoga.Yoga#YGNodeCalculateLayout NodeCalculateLayout}:</p>
 * 
 * <pre><code>
 * // Public API, 4x JNI call overhead
 * float l = YGNodeLayoutGetLeft(node);
 * float t = YGNodeLayoutGetTop(node);
 * float w = YGNodeLayoutGetWidth(node);
 * float h = YGNodeLayoutGetHeight(node);
 * 
 * // Internal API without overhead (plain memory accesses, assuming allocations are eliminated via EA)
 * YGLayout layout = YGNode.create(node).layout();
 * 
 * float l = layout.positions(YGEdgeLeft);
 * float t = layout.positions(YGEdgeTop);
 * float w = layout.dimensions(YGDimensionWidth);
 * float h = layout.dimensions(YGDimensionHeight);</code></pre>
 */
@org.lwjgl.system.NonnullDefault
package org.lwjgl.util.yoga;

