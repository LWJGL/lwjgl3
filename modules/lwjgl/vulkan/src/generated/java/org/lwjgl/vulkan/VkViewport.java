/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying a viewport.
 * 
 * <h5>Description</h5>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>Despite their names, {@code minDepth} <b>can</b> be less than, equal to, or greater than {@code maxDepth}.</p>
 * </div>
 * 
 * <p>The framebuffer depth coordinate <code>z<sub>f</sub></code> <b>may</b> be represented using either a fixed-point or floating-point representation. However, a floating-point representation <b>must</b> be used if the depth/stencil attachment has a floating-point depth component. If an <code>m</code>-bit fixed-point representation is used, we assume that it represents each value <code>k / (2<sup>m</sup> - 1)</code>, where <code>k ∈ { 0, 1, …​, 2<sup>m</sup>-1 }</code>, as <code>k</code> (e.g. 1.0 is represented in binary as a string of all ones).</p>
 * 
 * <p>The viewport parameters shown in the above equations are found from these values as</p>
 * 
 * <dl>
 * <dd><code>o<sub>x</sub> = x + width / 2</code></dd>
 * <dd><code>o<sub>y</sub> = y + height / 2</code></dd>
 * <dd><code>o<sub>z</sub> = minDepth</code></dd>
 * <dd><code>p<sub>x</sub> = width</code></dd>
 * <dd><code>p<sub>y</sub> = height</code></dd>
 * <dd><code>p<sub>z</sub> = maxDepth - minDepth</code>.</dd>
 * </dl>
 * 
 * <p>If a render pass transform is enabled, the values <code>(p<sub>x</sub>,p<sub>y</sub>)</code> and <code>(o<sub>x</sub>, o<sub>y</sub>)</code> defining the viewport are transformed as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#vertexpostproc-renderpass-transform">render pass transform</a> before participating in the viewport transform.</p>
 * 
 * <p>The application <b>can</b> specify a negative term for {@code height}, which has the effect of negating the y coordinate in clip space before performing the transform. When using a negative {@code height}, the application <b>should</b> also adjust the {@code y} value to point to the lower left corner of the viewport instead of the upper left corner. Using the negative {@code height} allows the application to avoid having to negate the y component of the {@code Position} output from the last <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader stage</a>.</p>
 * 
 * <p>The width and height of the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-maxViewportDimensions">implementation-dependent maximum viewport dimensions</a> <b>must</b> be greater than or equal to the width and height of the largest image which <b>can</b> be created and attached to a framebuffer.</p>
 * 
 * <p>The floating-point viewport bounds are represented with an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-viewportSubPixelBits">implementation-dependent precision</a>.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code width} <b>must</b> be greater than {@code 0.0}</li>
 * <li>{@code width} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxViewportDimensions}[0]</li>
 * <li>The absolute value of {@code height} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxViewportDimensions}[1]</li>
 * <li>{@code x} <b>must</b> be greater than or equal to {@code viewportBoundsRange}[0]</li>
 * <li><code>(x + width)</code> <b>must</b> be less than or equal to {@code viewportBoundsRange}[1]</li>
 * <li>{@code y} <b>must</b> be greater than or equal to {@code viewportBoundsRange}[0]</li>
 * <li>{@code y} <b>must</b> be less than or equal to {@code viewportBoundsRange}[1]</li>
 * <li><code>(y + height)</code> <b>must</b> be greater than or equal to {@code viewportBoundsRange}[0]</li>
 * <li><code>(y + height)</code> <b>must</b> be less than or equal to {@code viewportBoundsRange}[1]</li>
 * <li>Unless {@link EXTDepthRangeUnrestricted VK_EXT_depth_range_unrestricted} extension is enabled {@code minDepth} <b>must</b> be between {@code 0.0} and {@code 1.0}, inclusive</li>
 * <li>Unless {@link EXTDepthRangeUnrestricted VK_EXT_depth_range_unrestricted} extension is enabled {@code maxDepth} <b>must</b> be between {@code 0.0} and {@code 1.0}, inclusive</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkCommandBufferInheritanceViewportScissorInfoNV}, {@link VkPipelineViewportStateCreateInfo}, {@link VK10#vkCmdSetViewport CmdSetViewport}, {@link VK13#vkCmdSetViewportWithCount CmdSetViewportWithCount}, {@link EXTExtendedDynamicState#vkCmdSetViewportWithCountEXT CmdSetViewportWithCountEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkViewport {
 *     float {@link #x};
 *     float {@link #y};
 *     float {@link #width};
 *     float {@link #height};
 *     float {@link #minDepth};
 *     float {@link #maxDepth};
 * }</code></pre>
 */
public class VkViewport extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        X,
        Y,
        WIDTH,
        HEIGHT,
        MINDEPTH,
        MAXDEPTH;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        X = layout.offsetof(0);
        Y = layout.offsetof(1);
        WIDTH = layout.offsetof(2);
        HEIGHT = layout.offsetof(3);
        MINDEPTH = layout.offsetof(4);
        MAXDEPTH = layout.offsetof(5);
    }

    /**
     * Creates a {@code VkViewport} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkViewport(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** {@code x} and {@code y} are the viewport’s upper left corner <code>(x,y)</code>. */
    public float x() { return nx(address()); }
    /** see {@code x} */
    public float y() { return ny(address()); }
    /** {@code width} and {@code height} are the viewport’s width and height, respectively. */
    public float width() { return nwidth(address()); }
    /** see {@code width} */
    public float height() { return nheight(address()); }
    /** {@code minDepth} and {@code maxDepth} are the depth range for the viewport. */
    public float minDepth() { return nminDepth(address()); }
    /** see {@code minDepth} */
    public float maxDepth() { return nmaxDepth(address()); }

    /** Sets the specified value to the {@link #x} field. */
    public VkViewport x(float value) { nx(address(), value); return this; }
    /** Sets the specified value to the {@link #y} field. */
    public VkViewport y(float value) { ny(address(), value); return this; }
    /** Sets the specified value to the {@link #width} field. */
    public VkViewport width(float value) { nwidth(address(), value); return this; }
    /** Sets the specified value to the {@link #height} field. */
    public VkViewport height(float value) { nheight(address(), value); return this; }
    /** Sets the specified value to the {@link #minDepth} field. */
    public VkViewport minDepth(float value) { nminDepth(address(), value); return this; }
    /** Sets the specified value to the {@link #maxDepth} field. */
    public VkViewport maxDepth(float value) { nmaxDepth(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkViewport set(
        float x,
        float y,
        float width,
        float height,
        float minDepth,
        float maxDepth
    ) {
        x(x);
        y(y);
        width(width);
        height(height);
        minDepth(minDepth);
        maxDepth(maxDepth);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkViewport set(VkViewport src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkViewport} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkViewport malloc() {
        return wrap(VkViewport.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkViewport} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkViewport calloc() {
        return wrap(VkViewport.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkViewport} instance allocated with {@link BufferUtils}. */
    public static VkViewport create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkViewport.class, memAddress(container), container);
    }

    /** Returns a new {@code VkViewport} instance for the specified memory address. */
    public static VkViewport create(long address) {
        return wrap(VkViewport.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkViewport createSafe(long address) {
        return address == NULL ? null : wrap(VkViewport.class, address);
    }

    /**
     * Returns a new {@link VkViewport.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkViewport.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkViewport.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkViewport.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkViewport.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkViewport.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkViewport.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkViewport.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkViewport.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkViewport mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkViewport callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkViewport mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkViewport callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkViewport.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkViewport.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkViewport.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkViewport.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkViewport} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkViewport malloc(MemoryStack stack) {
        return wrap(VkViewport.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkViewport} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkViewport calloc(MemoryStack stack) {
        return wrap(VkViewport.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkViewport.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkViewport.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkViewport.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkViewport.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #x}. */
    public static float nx(long struct) { return UNSAFE.getFloat(null, struct + VkViewport.X); }
    /** Unsafe version of {@link #y}. */
    public static float ny(long struct) { return UNSAFE.getFloat(null, struct + VkViewport.Y); }
    /** Unsafe version of {@link #width}. */
    public static float nwidth(long struct) { return UNSAFE.getFloat(null, struct + VkViewport.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static float nheight(long struct) { return UNSAFE.getFloat(null, struct + VkViewport.HEIGHT); }
    /** Unsafe version of {@link #minDepth}. */
    public static float nminDepth(long struct) { return UNSAFE.getFloat(null, struct + VkViewport.MINDEPTH); }
    /** Unsafe version of {@link #maxDepth}. */
    public static float nmaxDepth(long struct) { return UNSAFE.getFloat(null, struct + VkViewport.MAXDEPTH); }

    /** Unsafe version of {@link #x(float) x}. */
    public static void nx(long struct, float value) { UNSAFE.putFloat(null, struct + VkViewport.X, value); }
    /** Unsafe version of {@link #y(float) y}. */
    public static void ny(long struct, float value) { UNSAFE.putFloat(null, struct + VkViewport.Y, value); }
    /** Unsafe version of {@link #width(float) width}. */
    public static void nwidth(long struct, float value) { UNSAFE.putFloat(null, struct + VkViewport.WIDTH, value); }
    /** Unsafe version of {@link #height(float) height}. */
    public static void nheight(long struct, float value) { UNSAFE.putFloat(null, struct + VkViewport.HEIGHT, value); }
    /** Unsafe version of {@link #minDepth(float) minDepth}. */
    public static void nminDepth(long struct, float value) { UNSAFE.putFloat(null, struct + VkViewport.MINDEPTH, value); }
    /** Unsafe version of {@link #maxDepth(float) maxDepth}. */
    public static void nmaxDepth(long struct, float value) { UNSAFE.putFloat(null, struct + VkViewport.MAXDEPTH, value); }

    // -----------------------------------

    /** An array of {@link VkViewport} structs. */
    public static class Buffer extends StructBuffer<VkViewport, Buffer> implements NativeResource {

        private static final VkViewport ELEMENT_FACTORY = VkViewport.create(-1L);

        /**
         * Creates a new {@code VkViewport.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkViewport#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected VkViewport getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkViewport#x} field. */
        public float x() { return VkViewport.nx(address()); }
        /** @return the value of the {@link VkViewport#y} field. */
        public float y() { return VkViewport.ny(address()); }
        /** @return the value of the {@link VkViewport#width} field. */
        public float width() { return VkViewport.nwidth(address()); }
        /** @return the value of the {@link VkViewport#height} field. */
        public float height() { return VkViewport.nheight(address()); }
        /** @return the value of the {@link VkViewport#minDepth} field. */
        public float minDepth() { return VkViewport.nminDepth(address()); }
        /** @return the value of the {@link VkViewport#maxDepth} field. */
        public float maxDepth() { return VkViewport.nmaxDepth(address()); }

        /** Sets the specified value to the {@link VkViewport#x} field. */
        public VkViewport.Buffer x(float value) { VkViewport.nx(address(), value); return this; }
        /** Sets the specified value to the {@link VkViewport#y} field. */
        public VkViewport.Buffer y(float value) { VkViewport.ny(address(), value); return this; }
        /** Sets the specified value to the {@link VkViewport#width} field. */
        public VkViewport.Buffer width(float value) { VkViewport.nwidth(address(), value); return this; }
        /** Sets the specified value to the {@link VkViewport#height} field. */
        public VkViewport.Buffer height(float value) { VkViewport.nheight(address(), value); return this; }
        /** Sets the specified value to the {@link VkViewport#minDepth} field. */
        public VkViewport.Buffer minDepth(float value) { VkViewport.nminDepth(address(), value); return this; }
        /** Sets the specified value to the {@link VkViewport#maxDepth} field. */
        public VkViewport.Buffer maxDepth(float value) { VkViewport.nmaxDepth(address(), value); return this; }

    }

}