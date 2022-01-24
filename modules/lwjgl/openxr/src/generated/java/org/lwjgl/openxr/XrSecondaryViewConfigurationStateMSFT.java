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
 * Returns the state of an enabled secondary view configuration.
 * 
 * <h5>Description</h5>
 * 
 * <p>When a secondary view configuration becomes active, the application <b>should</b> render its secondary views as soon as possible, by getting their view transforms and FOV using {@link XR10#xrLocateViews LocateViews} and then submitting composition layers to {@link XR10#xrEndFrame EndFrame} through the {@link XrSecondaryViewConfigurationFrameEndInfoMSFT} extension structure. When a secondary view configuration changes from inactive to active, the runtime <b>may</b> change {@link XrViewConfigurationView} of the given view configuration such as the recommended image width or height. An application <b>should</b> query for latest {@link XrViewConfigurationView} through {@link XR10#xrEnumerateViewConfigurationViews EnumerateViewConfigurationViews} function for the secondary view configuration and consider recreating swapchain images if necessary. The runtime <b>must</b> not change the {@link XrViewConfigurationView}, including recommended image width and height of a secondary view configuration when {@code active} remains true until the secondary view configuration deactivated or the session has ended.</p>
 * 
 * <p>If necessary, the application <b>can</b> take longer than a frame duration to prepare by calling {@link XR10#xrEndFrame EndFrame} without submitting layers for that secondary view configuration until ready. The runtime <b>should</b> delay the underlying scenario managed by the secondary view configuration until the application begins submitting frames with layers for that configuration. The active secondary view configuration composed output is undefined if the application stops submitting frames with layers for a secondary view configuration while {@code active} remains true.</p>
 * 
 * <p>When the runtime intends to conclude a secondary view configuration, for example when user stops video capture, the runtime makes the view configuration inactive by setting the corresponding {@code active} in the {@link XrSecondaryViewConfigurationStateMSFT} structure to false.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link MSFTSecondaryViewConfiguration XR_MSFT_secondary_view_configuration} extension <b>must</b> be enabled prior to using {@link XrSecondaryViewConfigurationStateMSFT}</li>
 * <li>{@code type} <b>must</b> be {@link MSFTSecondaryViewConfiguration#XR_TYPE_SECONDARY_VIEW_CONFIGURATION_STATE_MSFT TYPE_SECONDARY_VIEW_CONFIGURATION_STATE_MSFT}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code viewConfigurationType} <b>must</b> be a valid {@code XrViewConfigurationType} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrFrameState}, {@link XrSecondaryViewConfigurationFrameStateMSFT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSecondaryViewConfigurationStateMSFT {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     XrViewConfigurationType {@link #viewConfigurationType};
 *     XrBool32 {@link #active};
 * }</code></pre>
 */
public class XrSecondaryViewConfigurationStateMSFT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        VIEWCONFIGURATIONTYPE,
        ACTIVE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        VIEWCONFIGURATIONTYPE = layout.offsetof(2);
        ACTIVE = layout.offsetof(3);
    }

    /**
     * Creates a {@code XrSecondaryViewConfigurationStateMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSecondaryViewConfigurationStateMSFT(ByteBuffer container) {
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
    /** an {@code XrViewConfigurationType} that represents the returned state. */
    @NativeType("XrViewConfigurationType")
    public int viewConfigurationType() { return nviewConfigurationType(address()); }
    /** an {@code XrBool32} returns whether the secondary view configuration is active and displaying frames to users. */
    @NativeType("XrBool32")
    public boolean active() { return nactive(address()) != 0; }

    /** Sets the specified value to the {@link #type} field. */
    public XrSecondaryViewConfigurationStateMSFT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MSFTSecondaryViewConfiguration#XR_TYPE_SECONDARY_VIEW_CONFIGURATION_STATE_MSFT TYPE_SECONDARY_VIEW_CONFIGURATION_STATE_MSFT} value to the {@link #type} field. */
    public XrSecondaryViewConfigurationStateMSFT type$Default() { return type(MSFTSecondaryViewConfiguration.XR_TYPE_SECONDARY_VIEW_CONFIGURATION_STATE_MSFT); }
    /** Sets the specified value to the {@link #next} field. */
    public XrSecondaryViewConfigurationStateMSFT next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #viewConfigurationType} field. */
    public XrSecondaryViewConfigurationStateMSFT viewConfigurationType(@NativeType("XrViewConfigurationType") int value) { nviewConfigurationType(address(), value); return this; }
    /** Sets the specified value to the {@link #active} field. */
    public XrSecondaryViewConfigurationStateMSFT active(@NativeType("XrBool32") boolean value) { nactive(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public XrSecondaryViewConfigurationStateMSFT set(
        int type,
        long next,
        int viewConfigurationType,
        boolean active
    ) {
        type(type);
        next(next);
        viewConfigurationType(viewConfigurationType);
        active(active);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSecondaryViewConfigurationStateMSFT set(XrSecondaryViewConfigurationStateMSFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSecondaryViewConfigurationStateMSFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSecondaryViewConfigurationStateMSFT malloc() {
        return wrap(XrSecondaryViewConfigurationStateMSFT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrSecondaryViewConfigurationStateMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSecondaryViewConfigurationStateMSFT calloc() {
        return wrap(XrSecondaryViewConfigurationStateMSFT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrSecondaryViewConfigurationStateMSFT} instance allocated with {@link BufferUtils}. */
    public static XrSecondaryViewConfigurationStateMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrSecondaryViewConfigurationStateMSFT.class, memAddress(container), container);
    }

    /** Returns a new {@code XrSecondaryViewConfigurationStateMSFT} instance for the specified memory address. */
    public static XrSecondaryViewConfigurationStateMSFT create(long address) {
        return wrap(XrSecondaryViewConfigurationStateMSFT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSecondaryViewConfigurationStateMSFT createSafe(long address) {
        return address == NULL ? null : wrap(XrSecondaryViewConfigurationStateMSFT.class, address);
    }

    /**
     * Returns a new {@link XrSecondaryViewConfigurationStateMSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSecondaryViewConfigurationStateMSFT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSecondaryViewConfigurationStateMSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSecondaryViewConfigurationStateMSFT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSecondaryViewConfigurationStateMSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSecondaryViewConfigurationStateMSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrSecondaryViewConfigurationStateMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSecondaryViewConfigurationStateMSFT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSecondaryViewConfigurationStateMSFT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrSecondaryViewConfigurationStateMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSecondaryViewConfigurationStateMSFT malloc(MemoryStack stack) {
        return wrap(XrSecondaryViewConfigurationStateMSFT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrSecondaryViewConfigurationStateMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSecondaryViewConfigurationStateMSFT calloc(MemoryStack stack) {
        return wrap(XrSecondaryViewConfigurationStateMSFT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrSecondaryViewConfigurationStateMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSecondaryViewConfigurationStateMSFT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSecondaryViewConfigurationStateMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSecondaryViewConfigurationStateMSFT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrSecondaryViewConfigurationStateMSFT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSecondaryViewConfigurationStateMSFT.NEXT); }
    /** Unsafe version of {@link #viewConfigurationType}. */
    public static int nviewConfigurationType(long struct) { return UNSAFE.getInt(null, struct + XrSecondaryViewConfigurationStateMSFT.VIEWCONFIGURATIONTYPE); }
    /** Unsafe version of {@link #active}. */
    public static int nactive(long struct) { return UNSAFE.getInt(null, struct + XrSecondaryViewConfigurationStateMSFT.ACTIVE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrSecondaryViewConfigurationStateMSFT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSecondaryViewConfigurationStateMSFT.NEXT, value); }
    /** Unsafe version of {@link #viewConfigurationType(int) viewConfigurationType}. */
    public static void nviewConfigurationType(long struct, int value) { UNSAFE.putInt(null, struct + XrSecondaryViewConfigurationStateMSFT.VIEWCONFIGURATIONTYPE, value); }
    /** Unsafe version of {@link #active(boolean) active}. */
    public static void nactive(long struct, int value) { UNSAFE.putInt(null, struct + XrSecondaryViewConfigurationStateMSFT.ACTIVE, value); }

    // -----------------------------------

    /** An array of {@link XrSecondaryViewConfigurationStateMSFT} structs. */
    public static class Buffer extends StructBuffer<XrSecondaryViewConfigurationStateMSFT, Buffer> implements NativeResource {

        private static final XrSecondaryViewConfigurationStateMSFT ELEMENT_FACTORY = XrSecondaryViewConfigurationStateMSFT.create(-1L);

        /**
         * Creates a new {@code XrSecondaryViewConfigurationStateMSFT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSecondaryViewConfigurationStateMSFT#SIZEOF}, and its mark will be undefined.
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
        protected XrSecondaryViewConfigurationStateMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSecondaryViewConfigurationStateMSFT#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSecondaryViewConfigurationStateMSFT.ntype(address()); }
        /** @return the value of the {@link XrSecondaryViewConfigurationStateMSFT#next} field. */
        @NativeType("void *")
        public long next() { return XrSecondaryViewConfigurationStateMSFT.nnext(address()); }
        /** @return the value of the {@link XrSecondaryViewConfigurationStateMSFT#viewConfigurationType} field. */
        @NativeType("XrViewConfigurationType")
        public int viewConfigurationType() { return XrSecondaryViewConfigurationStateMSFT.nviewConfigurationType(address()); }
        /** @return the value of the {@link XrSecondaryViewConfigurationStateMSFT#active} field. */
        @NativeType("XrBool32")
        public boolean active() { return XrSecondaryViewConfigurationStateMSFT.nactive(address()) != 0; }

        /** Sets the specified value to the {@link XrSecondaryViewConfigurationStateMSFT#type} field. */
        public XrSecondaryViewConfigurationStateMSFT.Buffer type(@NativeType("XrStructureType") int value) { XrSecondaryViewConfigurationStateMSFT.ntype(address(), value); return this; }
        /** Sets the {@link MSFTSecondaryViewConfiguration#XR_TYPE_SECONDARY_VIEW_CONFIGURATION_STATE_MSFT TYPE_SECONDARY_VIEW_CONFIGURATION_STATE_MSFT} value to the {@link XrSecondaryViewConfigurationStateMSFT#type} field. */
        public XrSecondaryViewConfigurationStateMSFT.Buffer type$Default() { return type(MSFTSecondaryViewConfiguration.XR_TYPE_SECONDARY_VIEW_CONFIGURATION_STATE_MSFT); }
        /** Sets the specified value to the {@link XrSecondaryViewConfigurationStateMSFT#next} field. */
        public XrSecondaryViewConfigurationStateMSFT.Buffer next(@NativeType("void *") long value) { XrSecondaryViewConfigurationStateMSFT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrSecondaryViewConfigurationStateMSFT#viewConfigurationType} field. */
        public XrSecondaryViewConfigurationStateMSFT.Buffer viewConfigurationType(@NativeType("XrViewConfigurationType") int value) { XrSecondaryViewConfigurationStateMSFT.nviewConfigurationType(address(), value); return this; }
        /** Sets the specified value to the {@link XrSecondaryViewConfigurationStateMSFT#active} field. */
        public XrSecondaryViewConfigurationStateMSFT.Buffer active(@NativeType("XrBool32") boolean value) { XrSecondaryViewConfigurationStateMSFT.nactive(address(), value ? 1 : 0); return this; }

    }

}