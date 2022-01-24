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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Struct containing view locate information.
 * 
 * <h5>Description</h5>
 * 
 * <p>The {@link XrViewLocateInfo} structure contains the display time and space used to locate the view {@link XrView} structures.</p>
 * 
 * <p>The runtime <b>must</b> return error {@link XR10#XR_ERROR_VIEW_CONFIGURATION_TYPE_UNSUPPORTED ERROR_VIEW_CONFIGURATION_TYPE_UNSUPPORTED} if the given {@code viewConfigurationType} is not one of the supported type reported by {@link XR10#xrEnumerateViewConfigurations EnumerateViewConfigurations}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code type} <b>must</b> be {@link XR10#XR_TYPE_VIEW_LOCATE_INFO TYPE_VIEW_LOCATE_INFO}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a>. See also: {@link XrViewLocateFoveatedRenderingVARJO}</li>
 * <li>{@code viewConfigurationType} <b>must</b> be a valid {@code XrViewConfigurationType} value</li>
 * <li>{@code space} <b>must</b> be a valid {@code XrSpace} handle</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrView}, {@link XrViewState}, {@link XR10#xrLocateViews LocateViews}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrViewLocateInfo {
 *     XrStructureType type;
 *     void const * next;
 *     XrViewConfigurationType {@link #viewConfigurationType};
 *     XrTime {@link #displayTime};
 *     XrSpace {@link #space};
 * }</code></pre>
 */
public class XrViewLocateInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        VIEWCONFIGURATIONTYPE,
        DISPLAYTIME,
        SPACE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        VIEWCONFIGURATIONTYPE = layout.offsetof(2);
        DISPLAYTIME = layout.offsetof(3);
        SPACE = layout.offsetof(4);
    }

    /**
     * Creates a {@code XrViewLocateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrViewLocateInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** {@code XrViewConfigurationType} to query for. */
    @NativeType("XrViewConfigurationType")
    public int viewConfigurationType() { return nviewConfigurationType(address()); }
    /** the time for which the view poses are predicted. */
    @NativeType("XrTime")
    public long displayTime() { return ndisplayTime(address()); }
    /** the {@code XrSpace} in which the {@code pose} in each {@link XrView} is expressed. */
    @NativeType("XrSpace")
    public long space() { return nspace(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrViewLocateInfo type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link XR10#XR_TYPE_VIEW_LOCATE_INFO TYPE_VIEW_LOCATE_INFO} value to the {@code type} field. */
    public XrViewLocateInfo type$Default() { return type(XR10.XR_TYPE_VIEW_LOCATE_INFO); }
    /** Sets the specified value to the {@code next} field. */
    public XrViewLocateInfo next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Prepends the specified {@link XrViewLocateFoveatedRenderingVARJO} value to the {@code next} chain. */
    public XrViewLocateInfo next(XrViewLocateFoveatedRenderingVARJO value) { return this.next(value.next(this.next()).address()); }
    /** Sets the specified value to the {@link #viewConfigurationType} field. */
    public XrViewLocateInfo viewConfigurationType(@NativeType("XrViewConfigurationType") int value) { nviewConfigurationType(address(), value); return this; }
    /** Sets the specified value to the {@link #displayTime} field. */
    public XrViewLocateInfo displayTime(@NativeType("XrTime") long value) { ndisplayTime(address(), value); return this; }
    /** Sets the specified value to the {@link #space} field. */
    public XrViewLocateInfo space(XrSpace value) { nspace(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrViewLocateInfo set(
        int type,
        long next,
        int viewConfigurationType,
        long displayTime,
        XrSpace space
    ) {
        type(type);
        next(next);
        viewConfigurationType(viewConfigurationType);
        displayTime(displayTime);
        space(space);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrViewLocateInfo set(XrViewLocateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrViewLocateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrViewLocateInfo malloc() {
        return wrap(XrViewLocateInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrViewLocateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrViewLocateInfo calloc() {
        return wrap(XrViewLocateInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrViewLocateInfo} instance allocated with {@link BufferUtils}. */
    public static XrViewLocateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrViewLocateInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code XrViewLocateInfo} instance for the specified memory address. */
    public static XrViewLocateInfo create(long address) {
        return wrap(XrViewLocateInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrViewLocateInfo createSafe(long address) {
        return address == NULL ? null : wrap(XrViewLocateInfo.class, address);
    }

    /**
     * Returns a new {@link XrViewLocateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrViewLocateInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrViewLocateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrViewLocateInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrViewLocateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrViewLocateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrViewLocateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrViewLocateInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrViewLocateInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrViewLocateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrViewLocateInfo malloc(MemoryStack stack) {
        return wrap(XrViewLocateInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrViewLocateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrViewLocateInfo calloc(MemoryStack stack) {
        return wrap(XrViewLocateInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrViewLocateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrViewLocateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrViewLocateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrViewLocateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrViewLocateInfo.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrViewLocateInfo.NEXT); }
    /** Unsafe version of {@link #viewConfigurationType}. */
    public static int nviewConfigurationType(long struct) { return UNSAFE.getInt(null, struct + XrViewLocateInfo.VIEWCONFIGURATIONTYPE); }
    /** Unsafe version of {@link #displayTime}. */
    public static long ndisplayTime(long struct) { return UNSAFE.getLong(null, struct + XrViewLocateInfo.DISPLAYTIME); }
    /** Unsafe version of {@link #space}. */
    public static long nspace(long struct) { return memGetAddress(struct + XrViewLocateInfo.SPACE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrViewLocateInfo.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrViewLocateInfo.NEXT, value); }
    /** Unsafe version of {@link #viewConfigurationType(int) viewConfigurationType}. */
    public static void nviewConfigurationType(long struct, int value) { UNSAFE.putInt(null, struct + XrViewLocateInfo.VIEWCONFIGURATIONTYPE, value); }
    /** Unsafe version of {@link #displayTime(long) displayTime}. */
    public static void ndisplayTime(long struct, long value) { UNSAFE.putLong(null, struct + XrViewLocateInfo.DISPLAYTIME, value); }
    /** Unsafe version of {@link #space(XrSpace) space}. */
    public static void nspace(long struct, XrSpace value) { memPutAddress(struct + XrViewLocateInfo.SPACE, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrViewLocateInfo.SPACE));
    }

    // -----------------------------------

    /** An array of {@link XrViewLocateInfo} structs. */
    public static class Buffer extends StructBuffer<XrViewLocateInfo, Buffer> implements NativeResource {

        private static final XrViewLocateInfo ELEMENT_FACTORY = XrViewLocateInfo.create(-1L);

        /**
         * Creates a new {@code XrViewLocateInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrViewLocateInfo#SIZEOF}, and its mark will be undefined.
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
        protected XrViewLocateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrViewLocateInfo.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrViewLocateInfo.nnext(address()); }
        /** @return the value of the {@link XrViewLocateInfo#viewConfigurationType} field. */
        @NativeType("XrViewConfigurationType")
        public int viewConfigurationType() { return XrViewLocateInfo.nviewConfigurationType(address()); }
        /** @return the value of the {@link XrViewLocateInfo#displayTime} field. */
        @NativeType("XrTime")
        public long displayTime() { return XrViewLocateInfo.ndisplayTime(address()); }
        /** @return the value of the {@link XrViewLocateInfo#space} field. */
        @NativeType("XrSpace")
        public long space() { return XrViewLocateInfo.nspace(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrViewLocateInfo.Buffer type(@NativeType("XrStructureType") int value) { XrViewLocateInfo.ntype(address(), value); return this; }
        /** Sets the {@link XR10#XR_TYPE_VIEW_LOCATE_INFO TYPE_VIEW_LOCATE_INFO} value to the {@code type} field. */
        public XrViewLocateInfo.Buffer type$Default() { return type(XR10.XR_TYPE_VIEW_LOCATE_INFO); }
        /** Sets the specified value to the {@code next} field. */
        public XrViewLocateInfo.Buffer next(@NativeType("void const *") long value) { XrViewLocateInfo.nnext(address(), value); return this; }
        /** Prepends the specified {@link XrViewLocateFoveatedRenderingVARJO} value to the {@code next} chain. */
        public XrViewLocateInfo.Buffer next(XrViewLocateFoveatedRenderingVARJO value) { return this.next(value.next(this.next()).address()); }
        /** Sets the specified value to the {@link XrViewLocateInfo#viewConfigurationType} field. */
        public XrViewLocateInfo.Buffer viewConfigurationType(@NativeType("XrViewConfigurationType") int value) { XrViewLocateInfo.nviewConfigurationType(address(), value); return this; }
        /** Sets the specified value to the {@link XrViewLocateInfo#displayTime} field. */
        public XrViewLocateInfo.Buffer displayTime(@NativeType("XrTime") long value) { XrViewLocateInfo.ndisplayTime(address(), value); return this; }
        /** Sets the specified value to the {@link XrViewLocateInfo#space} field. */
        public XrViewLocateInfo.Buffer space(XrSpace value) { XrViewLocateInfo.nspace(address(), value); return this; }

    }

}