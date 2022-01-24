/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Foveated view configuration views.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link VARJOFoveatedRendering XR_VARJO_foveated_rendering} extension <b>must</b> be enabled prior to using {@link XrFoveatedViewConfigurationViewVARJO}</li>
 * <li>{@code type} <b>must</b> be {@link VARJOFoveatedRendering#XR_TYPE_FOVEATED_VIEW_CONFIGURATION_VIEW_VARJO TYPE_FOVEATED_VIEW_CONFIGURATION_VIEW_VARJO}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <p>For example:</p>
 * 
 * <pre><code>
 * XrInstance instance; // previously populated
 * XrSystemId systemId; // previously populated
 * XrViewConfigurationType viewConfigType; // Select XR_VIEW_CONFIGURATION_TYPE_PRIMARY_QUAD_VARJO
 * 
 * XrSystemFoveatedRenderingPropertiesVARJO foveatedRenderingProperties{XR_TYPE_SYSTEM_FOVEATED_RENDERING_PROPERTIES_VARJO};
 * XrSystemProperties systemProperties{XR_TYPE_SYSTEM_PROPERTIES, &amp;foveatedRenderingProperties};
 * CHK_XR(xrGetSystemProperties(instance, systemId, &amp;systemProperties));
 * 
 * uint32_t viewCount;
 * CHK_XR(xrEnumerateViewConfigurationViews(instance, systemId, viewConfigType, 0, &amp;viewCount, nullptr));
 * // Non-foveated rendering views dimensions
 * std::vector&lt;XrViewConfigurationView&gt; configViews(viewCount, {XR_TYPE_VIEW_CONFIGURATION_VIEW});
 * CHK_XR(xrEnumerateViewConfigurationViews(instance, systemId, viewConfigType, viewCount, &amp;viewCount, configViews.data()));
 * 
 * // Foveated rendering views dimensions
 * std::vector&lt;XrViewConfigurationView&gt; foveatedViews;
 * if (foveatedRenderingProperties.supportsFoveatedRendering &amp;&amp; viewConfigType == XR_VIEW_CONFIGURATION_TYPE_PRIMARY_QUAD_VARJO) {
 *   std::vector&lt;XrFoveatedViewConfigurationViewVARJO&gt; requestFoveatedConfig{4, {XR_TYPE_FOVEATED_VIEW_CONFIGURATION_VIEW_VARJO, nullptr, XR_TRUE}};
 *   foveatedViews = std::vector&lt;XrViewConfigurationView&gt;{4, {XR_TYPE_VIEW_CONFIGURATION_VIEW}};
 *   for (size_t i = 0; i &lt; 4; i++) {
 *     foveatedViews[i].next = &amp;requestFoveatedConfig[i];
 *   }
 *   CHK_XR(xrEnumerateViewConfigurationViews(instance, systemId, viewConfigType, viewCount, &amp;viewCount, foveatedViews.data()));
 * }</code></pre>
 * 
 * <h5>Note</h5>
 * 
 * <p>Applications using this extension are encouraged to create 2 sets of swapchains or one big enough set of swapchains and 2 sets of viewports. One set will be used when rendering gaze is not available and other one will be used when foveated rendering and rendering gaze is available. Using foveated textures <b>may</b> not provide optimal visual quality when rendering gaze is not available.</p>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrViewConfigurationView}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrFoveatedViewConfigurationViewVARJO {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     XrBool32 {@link #foveatedRenderingActive};
 * }</code></pre>
 */
public class XrFoveatedViewConfigurationViewVARJO extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        FOVEATEDRENDERINGACTIVE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        FOVEATEDRENDERINGACTIVE = layout.offsetof(2);
    }

    /**
     * Creates a {@code XrFoveatedViewConfigurationViewVARJO} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrFoveatedViewConfigurationViewVARJO(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** an {@code XrBool32}, indicating if the runtime should return foveated view configuration view. */
    @NativeType("XrBool32")
    public boolean foveatedRenderingActive() { return nfoveatedRenderingActive(address()) != 0; }

    /** Sets the specified value to the {@link #type} field. */
    public XrFoveatedViewConfigurationViewVARJO type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link VARJOFoveatedRendering#XR_TYPE_FOVEATED_VIEW_CONFIGURATION_VIEW_VARJO TYPE_FOVEATED_VIEW_CONFIGURATION_VIEW_VARJO} value to the {@link #type} field. */
    public XrFoveatedViewConfigurationViewVARJO type$Default() { return type(VARJOFoveatedRendering.XR_TYPE_FOVEATED_VIEW_CONFIGURATION_VIEW_VARJO); }
    /** Sets the specified value to the {@link #next} field. */
    public XrFoveatedViewConfigurationViewVARJO next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #foveatedRenderingActive} field. */
    public XrFoveatedViewConfigurationViewVARJO foveatedRenderingActive(@NativeType("XrBool32") boolean value) { nfoveatedRenderingActive(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public XrFoveatedViewConfigurationViewVARJO set(
        int type,
        long next,
        boolean foveatedRenderingActive
    ) {
        type(type);
        next(next);
        foveatedRenderingActive(foveatedRenderingActive);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrFoveatedViewConfigurationViewVARJO set(XrFoveatedViewConfigurationViewVARJO src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrFoveatedViewConfigurationViewVARJO} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrFoveatedViewConfigurationViewVARJO malloc() {
        return wrap(XrFoveatedViewConfigurationViewVARJO.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrFoveatedViewConfigurationViewVARJO} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrFoveatedViewConfigurationViewVARJO calloc() {
        return wrap(XrFoveatedViewConfigurationViewVARJO.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrFoveatedViewConfigurationViewVARJO} instance allocated with {@link BufferUtils}. */
    public static XrFoveatedViewConfigurationViewVARJO create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrFoveatedViewConfigurationViewVARJO.class, memAddress(container), container);
    }

    /** Returns a new {@code XrFoveatedViewConfigurationViewVARJO} instance for the specified memory address. */
    public static XrFoveatedViewConfigurationViewVARJO create(long address) {
        return wrap(XrFoveatedViewConfigurationViewVARJO.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrFoveatedViewConfigurationViewVARJO createSafe(long address) {
        return address == NULL ? null : wrap(XrFoveatedViewConfigurationViewVARJO.class, address);
    }

    /**
     * Returns a new {@link XrFoveatedViewConfigurationViewVARJO.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFoveatedViewConfigurationViewVARJO.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrFoveatedViewConfigurationViewVARJO.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFoveatedViewConfigurationViewVARJO.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFoveatedViewConfigurationViewVARJO.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrFoveatedViewConfigurationViewVARJO.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrFoveatedViewConfigurationViewVARJO.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrFoveatedViewConfigurationViewVARJO.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrFoveatedViewConfigurationViewVARJO.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrFoveatedViewConfigurationViewVARJO} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFoveatedViewConfigurationViewVARJO malloc(MemoryStack stack) {
        return wrap(XrFoveatedViewConfigurationViewVARJO.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrFoveatedViewConfigurationViewVARJO} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFoveatedViewConfigurationViewVARJO calloc(MemoryStack stack) {
        return wrap(XrFoveatedViewConfigurationViewVARJO.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrFoveatedViewConfigurationViewVARJO.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFoveatedViewConfigurationViewVARJO.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFoveatedViewConfigurationViewVARJO.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFoveatedViewConfigurationViewVARJO.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrFoveatedViewConfigurationViewVARJO.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrFoveatedViewConfigurationViewVARJO.NEXT); }
    /** Unsafe version of {@link #foveatedRenderingActive}. */
    public static int nfoveatedRenderingActive(long struct) { return UNSAFE.getInt(null, struct + XrFoveatedViewConfigurationViewVARJO.FOVEATEDRENDERINGACTIVE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrFoveatedViewConfigurationViewVARJO.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrFoveatedViewConfigurationViewVARJO.NEXT, value); }
    /** Unsafe version of {@link #foveatedRenderingActive(boolean) foveatedRenderingActive}. */
    public static void nfoveatedRenderingActive(long struct, int value) { UNSAFE.putInt(null, struct + XrFoveatedViewConfigurationViewVARJO.FOVEATEDRENDERINGACTIVE, value); }

    // -----------------------------------

    /** An array of {@link XrFoveatedViewConfigurationViewVARJO} structs. */
    public static class Buffer extends StructBuffer<XrFoveatedViewConfigurationViewVARJO, Buffer> implements NativeResource {

        private static final XrFoveatedViewConfigurationViewVARJO ELEMENT_FACTORY = XrFoveatedViewConfigurationViewVARJO.create(-1L);

        /**
         * Creates a new {@code XrFoveatedViewConfigurationViewVARJO.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrFoveatedViewConfigurationViewVARJO#SIZEOF}, and its mark will be undefined.
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
        protected XrFoveatedViewConfigurationViewVARJO getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrFoveatedViewConfigurationViewVARJO#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrFoveatedViewConfigurationViewVARJO.ntype(address()); }
        /** @return the value of the {@link XrFoveatedViewConfigurationViewVARJO#next} field. */
        @NativeType("void *")
        public long next() { return XrFoveatedViewConfigurationViewVARJO.nnext(address()); }
        /** @return the value of the {@link XrFoveatedViewConfigurationViewVARJO#foveatedRenderingActive} field. */
        @NativeType("XrBool32")
        public boolean foveatedRenderingActive() { return XrFoveatedViewConfigurationViewVARJO.nfoveatedRenderingActive(address()) != 0; }

        /** Sets the specified value to the {@link XrFoveatedViewConfigurationViewVARJO#type} field. */
        public XrFoveatedViewConfigurationViewVARJO.Buffer type(@NativeType("XrStructureType") int value) { XrFoveatedViewConfigurationViewVARJO.ntype(address(), value); return this; }
        /** Sets the {@link VARJOFoveatedRendering#XR_TYPE_FOVEATED_VIEW_CONFIGURATION_VIEW_VARJO TYPE_FOVEATED_VIEW_CONFIGURATION_VIEW_VARJO} value to the {@link XrFoveatedViewConfigurationViewVARJO#type} field. */
        public XrFoveatedViewConfigurationViewVARJO.Buffer type$Default() { return type(VARJOFoveatedRendering.XR_TYPE_FOVEATED_VIEW_CONFIGURATION_VIEW_VARJO); }
        /** Sets the specified value to the {@link XrFoveatedViewConfigurationViewVARJO#next} field. */
        public XrFoveatedViewConfigurationViewVARJO.Buffer next(@NativeType("void *") long value) { XrFoveatedViewConfigurationViewVARJO.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrFoveatedViewConfigurationViewVARJO#foveatedRenderingActive} field. */
        public XrFoveatedViewConfigurationViewVARJO.Buffer foveatedRenderingActive(@NativeType("XrBool32") boolean value) { XrFoveatedViewConfigurationViewVARJO.nfoveatedRenderingActive(address(), value ? 1 : 0); return this; }

    }

}