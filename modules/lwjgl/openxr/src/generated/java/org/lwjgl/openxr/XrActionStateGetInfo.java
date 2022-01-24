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
 * Information to get action state.
 * 
 * <h5>Description</h5>
 * 
 * <p>See {@link XrActionCreateInfo} for a description of subaction paths, and the restrictions on their use.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code type} <b>must</b> be {@link XR10#XR_TYPE_ACTION_STATE_GET_INFO TYPE_ACTION_STATE_GET_INFO}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code action} <b>must</b> be a valid {@code XrAction} handle</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XR10#xrGetActionStateBoolean GetActionStateBoolean}, {@link XR10#xrGetActionStateFloat GetActionStateFloat}, {@link XR10#xrGetActionStatePose GetActionStatePose}, {@link XR10#xrGetActionStateVector2f GetActionStateVector2f}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrActionStateGetInfo {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrAction {@link #action};
 *     XrPath {@link #subactionPath};
 * }</code></pre>
 */
public class XrActionStateGetInfo extends Struct implements NativeResource {

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
     * Creates a {@code XrActionStateGetInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrActionStateGetInfo(ByteBuffer container) {
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
    /** the {@code XrAction} being queried. */
    @NativeType("XrAction")
    public long action() { return naction(address()); }
    /** the subaction path {@code XrPath} to query data from, or {@link XR10#XR_NULL_PATH NULL_PATH} to specify all subaction paths. If the subaction path is specified, it is one of the subaction paths that were specified when the action was created. If the subaction path was not specified when the action was created, the runtime <b>must</b> return {@link XR10#XR_ERROR_PATH_UNSUPPORTED ERROR_PATH_UNSUPPORTED}. If this parameter is specified, the runtime <b>must</b> return data that originates only from the subaction paths specified. */
    @NativeType("XrPath")
    public long subactionPath() { return nsubactionPath(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrActionStateGetInfo type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link XR10#XR_TYPE_ACTION_STATE_GET_INFO TYPE_ACTION_STATE_GET_INFO} value to the {@link #type} field. */
    public XrActionStateGetInfo type$Default() { return type(XR10.XR_TYPE_ACTION_STATE_GET_INFO); }
    /** Sets the specified value to the {@link #next} field. */
    public XrActionStateGetInfo next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #action} field. */
    public XrActionStateGetInfo action(XrAction value) { naction(address(), value); return this; }
    /** Sets the specified value to the {@link #subactionPath} field. */
    public XrActionStateGetInfo subactionPath(@NativeType("XrPath") long value) { nsubactionPath(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrActionStateGetInfo set(
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
    public XrActionStateGetInfo set(XrActionStateGetInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrActionStateGetInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrActionStateGetInfo malloc() {
        return wrap(XrActionStateGetInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrActionStateGetInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrActionStateGetInfo calloc() {
        return wrap(XrActionStateGetInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrActionStateGetInfo} instance allocated with {@link BufferUtils}. */
    public static XrActionStateGetInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrActionStateGetInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code XrActionStateGetInfo} instance for the specified memory address. */
    public static XrActionStateGetInfo create(long address) {
        return wrap(XrActionStateGetInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrActionStateGetInfo createSafe(long address) {
        return address == NULL ? null : wrap(XrActionStateGetInfo.class, address);
    }

    /**
     * Returns a new {@link XrActionStateGetInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrActionStateGetInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrActionStateGetInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrActionStateGetInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrActionStateGetInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrActionStateGetInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrActionStateGetInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrActionStateGetInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrActionStateGetInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrActionStateGetInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrActionStateGetInfo malloc(MemoryStack stack) {
        return wrap(XrActionStateGetInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrActionStateGetInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrActionStateGetInfo calloc(MemoryStack stack) {
        return wrap(XrActionStateGetInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrActionStateGetInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrActionStateGetInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrActionStateGetInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrActionStateGetInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrActionStateGetInfo.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrActionStateGetInfo.NEXT); }
    /** Unsafe version of {@link #action}. */
    public static long naction(long struct) { return memGetAddress(struct + XrActionStateGetInfo.ACTION); }
    /** Unsafe version of {@link #subactionPath}. */
    public static long nsubactionPath(long struct) { return UNSAFE.getLong(null, struct + XrActionStateGetInfo.SUBACTIONPATH); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrActionStateGetInfo.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrActionStateGetInfo.NEXT, value); }
    /** Unsafe version of {@link #action(XrAction) action}. */
    public static void naction(long struct, XrAction value) { memPutAddress(struct + XrActionStateGetInfo.ACTION, value.address()); }
    /** Unsafe version of {@link #subactionPath(long) subactionPath}. */
    public static void nsubactionPath(long struct, long value) { UNSAFE.putLong(null, struct + XrActionStateGetInfo.SUBACTIONPATH, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrActionStateGetInfo.ACTION));
    }

    // -----------------------------------

    /** An array of {@link XrActionStateGetInfo} structs. */
    public static class Buffer extends StructBuffer<XrActionStateGetInfo, Buffer> implements NativeResource {

        private static final XrActionStateGetInfo ELEMENT_FACTORY = XrActionStateGetInfo.create(-1L);

        /**
         * Creates a new {@code XrActionStateGetInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrActionStateGetInfo#SIZEOF}, and its mark will be undefined.
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
        protected XrActionStateGetInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrActionStateGetInfo#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrActionStateGetInfo.ntype(address()); }
        /** @return the value of the {@link XrActionStateGetInfo#next} field. */
        @NativeType("void const *")
        public long next() { return XrActionStateGetInfo.nnext(address()); }
        /** @return the value of the {@link XrActionStateGetInfo#action} field. */
        @NativeType("XrAction")
        public long action() { return XrActionStateGetInfo.naction(address()); }
        /** @return the value of the {@link XrActionStateGetInfo#subactionPath} field. */
        @NativeType("XrPath")
        public long subactionPath() { return XrActionStateGetInfo.nsubactionPath(address()); }

        /** Sets the specified value to the {@link XrActionStateGetInfo#type} field. */
        public XrActionStateGetInfo.Buffer type(@NativeType("XrStructureType") int value) { XrActionStateGetInfo.ntype(address(), value); return this; }
        /** Sets the {@link XR10#XR_TYPE_ACTION_STATE_GET_INFO TYPE_ACTION_STATE_GET_INFO} value to the {@link XrActionStateGetInfo#type} field. */
        public XrActionStateGetInfo.Buffer type$Default() { return type(XR10.XR_TYPE_ACTION_STATE_GET_INFO); }
        /** Sets the specified value to the {@link XrActionStateGetInfo#next} field. */
        public XrActionStateGetInfo.Buffer next(@NativeType("void const *") long value) { XrActionStateGetInfo.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrActionStateGetInfo#action} field. */
        public XrActionStateGetInfo.Buffer action(XrAction value) { XrActionStateGetInfo.naction(address(), value); return this; }
        /** Sets the specified value to the {@link XrActionStateGetInfo#subactionPath} field. */
        public XrActionStateGetInfo.Buffer subactionPath(@NativeType("XrPath") long value) { XrActionStateGetInfo.nsubactionPath(address(), value); return this; }

    }

}