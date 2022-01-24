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
 * Information to output haptic feedback.
 * 
 * <h5>Description</h5>
 * 
 * <p>See {@link XrActionCreateInfo} for a description of subaction paths, and the restrictions on their use.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code type} <b>must</b> be {@link XR10#XR_TYPE_HAPTIC_ACTION_INFO TYPE_HAPTIC_ACTION_INFO}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code action} <b>must</b> be a valid {@code XrAction} handle</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XR10#xrApplyHapticFeedback ApplyHapticFeedback}, {@link XR10#xrStopHapticFeedback StopHapticFeedback}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrHapticActionInfo {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrAction {@link #action};
 *     XrPath {@link #subactionPath};
 * }</code></pre>
 */
public class XrHapticActionInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        ACTION,
        SUBACTIONPATH;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        ACTION = layout.offsetof(2);
        SUBACTIONPATH = layout.offsetof(3);
    }

    /**
     * Creates a {@code XrHapticActionInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrHapticActionInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** the {@code XrAction} handle for the desired output haptic action. */
    @NativeType("XrAction")
    public long action() { return naction(address()); }
    /** the subaction path {@code XrPath} of the device to send the haptic event to, or {@link XR10#XR_NULL_PATH NULL_PATH} to specify all subaction paths. If the subaction path is specified, it is one of the subaction paths that were specified when the action was created. If the subaction path was not specified when the action was created, the runtime <b>must</b> return {@link XR10#XR_ERROR_PATH_UNSUPPORTED ERROR_PATH_UNSUPPORTED}. If this parameter is specified, the runtime <b>must</b> trigger the haptic events only on the device from the subaction path. */
    @NativeType("XrPath")
    public long subactionPath() { return nsubactionPath(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrHapticActionInfo type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link XR10#XR_TYPE_HAPTIC_ACTION_INFO TYPE_HAPTIC_ACTION_INFO} value to the {@link #type} field. */
    public XrHapticActionInfo type$Default() { return type(XR10.XR_TYPE_HAPTIC_ACTION_INFO); }
    /** Sets the specified value to the {@link #next} field. */
    public XrHapticActionInfo next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #action} field. */
    public XrHapticActionInfo action(XrAction value) { naction(address(), value); return this; }
    /** Sets the specified value to the {@link #subactionPath} field. */
    public XrHapticActionInfo subactionPath(@NativeType("XrPath") long value) { nsubactionPath(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrHapticActionInfo set(
        int type,
        long next,
        XrAction action,
        long subactionPath
    ) {
        type(type);
        next(next);
        action(action);
        subactionPath(subactionPath);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrHapticActionInfo set(XrHapticActionInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrHapticActionInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrHapticActionInfo malloc() {
        return wrap(XrHapticActionInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrHapticActionInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrHapticActionInfo calloc() {
        return wrap(XrHapticActionInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrHapticActionInfo} instance allocated with {@link BufferUtils}. */
    public static XrHapticActionInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrHapticActionInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code XrHapticActionInfo} instance for the specified memory address. */
    public static XrHapticActionInfo create(long address) {
        return wrap(XrHapticActionInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrHapticActionInfo createSafe(long address) {
        return address == NULL ? null : wrap(XrHapticActionInfo.class, address);
    }

    /**
     * Returns a new {@link XrHapticActionInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHapticActionInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrHapticActionInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHapticActionInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHapticActionInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrHapticActionInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrHapticActionInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrHapticActionInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrHapticActionInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrHapticActionInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHapticActionInfo malloc(MemoryStack stack) {
        return wrap(XrHapticActionInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrHapticActionInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHapticActionInfo calloc(MemoryStack stack) {
        return wrap(XrHapticActionInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrHapticActionInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHapticActionInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHapticActionInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHapticActionInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrHapticActionInfo.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrHapticActionInfo.NEXT); }
    /** Unsafe version of {@link #action}. */
    public static long naction(long struct) { return memGetAddress(struct + XrHapticActionInfo.ACTION); }
    /** Unsafe version of {@link #subactionPath}. */
    public static long nsubactionPath(long struct) { return UNSAFE.getLong(null, struct + XrHapticActionInfo.SUBACTIONPATH); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrHapticActionInfo.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrHapticActionInfo.NEXT, value); }
    /** Unsafe version of {@link #action(XrAction) action}. */
    public static void naction(long struct, XrAction value) { memPutAddress(struct + XrHapticActionInfo.ACTION, value.address()); }
    /** Unsafe version of {@link #subactionPath(long) subactionPath}. */
    public static void nsubactionPath(long struct, long value) { UNSAFE.putLong(null, struct + XrHapticActionInfo.SUBACTIONPATH, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrHapticActionInfo.ACTION));
    }

    // -----------------------------------

    /** An array of {@link XrHapticActionInfo} structs. */
    public static class Buffer extends StructBuffer<XrHapticActionInfo, Buffer> implements NativeResource {

        private static final XrHapticActionInfo ELEMENT_FACTORY = XrHapticActionInfo.create(-1L);

        /**
         * Creates a new {@code XrHapticActionInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrHapticActionInfo#SIZEOF}, and its mark will be undefined.
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
        protected XrHapticActionInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrHapticActionInfo#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrHapticActionInfo.ntype(address()); }
        /** @return the value of the {@link XrHapticActionInfo#next} field. */
        @NativeType("void const *")
        public long next() { return XrHapticActionInfo.nnext(address()); }
        /** @return the value of the {@link XrHapticActionInfo#action} field. */
        @NativeType("XrAction")
        public long action() { return XrHapticActionInfo.naction(address()); }
        /** @return the value of the {@link XrHapticActionInfo#subactionPath} field. */
        @NativeType("XrPath")
        public long subactionPath() { return XrHapticActionInfo.nsubactionPath(address()); }

        /** Sets the specified value to the {@link XrHapticActionInfo#type} field. */
        public XrHapticActionInfo.Buffer type(@NativeType("XrStructureType") int value) { XrHapticActionInfo.ntype(address(), value); return this; }
        /** Sets the {@link XR10#XR_TYPE_HAPTIC_ACTION_INFO TYPE_HAPTIC_ACTION_INFO} value to the {@link XrHapticActionInfo#type} field. */
        public XrHapticActionInfo.Buffer type$Default() { return type(XR10.XR_TYPE_HAPTIC_ACTION_INFO); }
        /** Sets the specified value to the {@link XrHapticActionInfo#next} field. */
        public XrHapticActionInfo.Buffer next(@NativeType("void const *") long value) { XrHapticActionInfo.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrHapticActionInfo#action} field. */
        public XrHapticActionInfo.Buffer action(XrAction value) { XrHapticActionInfo.naction(address(), value); return this; }
        /** Sets the specified value to the {@link XrHapticActionInfo#subactionPath} field. */
        public XrHapticActionInfo.Buffer subactionPath(@NativeType("XrPath") long value) { XrHapticActionInfo.nsubactionPath(address(), value); return this; }

    }

}