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
 * Creation info for an action space.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code type} <b>must</b> be {@link XR10#XR_TYPE_ACTION_SPACE_CREATE_INFO TYPE_ACTION_SPACE_CREATE_INFO}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code action} <b>must</b> be a valid {@code XrAction} handle</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrPosef}, {@link XR10#xrCreateActionSpace CreateActionSpace}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrActionSpaceCreateInfo {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrAction {@link #action};
 *     XrPath {@link #subactionPath};
 *     {@link XrPosef XrPosef} {@link #poseInActionSpace};
 * }</code></pre>
 */
public class XrActionSpaceCreateInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        ACTION,
        SUBACTIONPATH,
        POSEINACTIONSPACE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(8),
            __member(XrPosef.SIZEOF, XrPosef.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        ACTION = layout.offsetof(2);
        SUBACTIONPATH = layout.offsetof(3);
        POSEINACTIONSPACE = layout.offsetof(4);
    }

    /**
     * Creates a {@code XrActionSpaceCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrActionSpaceCreateInfo(ByteBuffer container) {
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
    /** a handle to a pose {@code XrAction} previously created with {@link XR10#xrCreateAction CreateAction}. */
    @NativeType("XrAction")
    public long action() { return naction(address()); }
    /** {@link XR10#XR_NULL_PATH NULL_PATH} or an {@code XrPath} that was specified when the action was created. If {@code subactionPath} is a valid path not specified when the action was created the runtime <b>must</b> return {@link XR10#XR_ERROR_PATH_UNSUPPORTED ERROR_PATH_UNSUPPORTED}. If this parameter is set, the runtime <b>must</b> create a space that is relative to only that subaction’s pose binding. */
    @NativeType("XrPath")
    public long subactionPath() { return nsubactionPath(address()); }
    /** an {@link XrPosef} defining the position and orientation of the new space’s origin within the natural reference frame of the pose action. */
    public XrPosef poseInActionSpace() { return nposeInActionSpace(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrActionSpaceCreateInfo type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link XR10#XR_TYPE_ACTION_SPACE_CREATE_INFO TYPE_ACTION_SPACE_CREATE_INFO} value to the {@link #type} field. */
    public XrActionSpaceCreateInfo type$Default() { return type(XR10.XR_TYPE_ACTION_SPACE_CREATE_INFO); }
    /** Sets the specified value to the {@link #next} field. */
    public XrActionSpaceCreateInfo next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #action} field. */
    public XrActionSpaceCreateInfo action(XrAction value) { naction(address(), value); return this; }
    /** Sets the specified value to the {@link #subactionPath} field. */
    public XrActionSpaceCreateInfo subactionPath(@NativeType("XrPath") long value) { nsubactionPath(address(), value); return this; }
    /** Copies the specified {@link XrPosef} to the {@link #poseInActionSpace} field. */
    public XrActionSpaceCreateInfo poseInActionSpace(XrPosef value) { nposeInActionSpace(address(), value); return this; }
    /** Passes the {@link #poseInActionSpace} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrActionSpaceCreateInfo poseInActionSpace(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(poseInActionSpace()); return this; }

    /** Initializes this struct with the specified values. */
    public XrActionSpaceCreateInfo set(
        int type,
        long next,
        XrAction action,
        long subactionPath,
        XrPosef poseInActionSpace
    ) {
        type(type);
        next(next);
        action(action);
        subactionPath(subactionPath);
        poseInActionSpace(poseInActionSpace);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrActionSpaceCreateInfo set(XrActionSpaceCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrActionSpaceCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrActionSpaceCreateInfo malloc() {
        return wrap(XrActionSpaceCreateInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrActionSpaceCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrActionSpaceCreateInfo calloc() {
        return wrap(XrActionSpaceCreateInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrActionSpaceCreateInfo} instance allocated with {@link BufferUtils}. */
    public static XrActionSpaceCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrActionSpaceCreateInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code XrActionSpaceCreateInfo} instance for the specified memory address. */
    public static XrActionSpaceCreateInfo create(long address) {
        return wrap(XrActionSpaceCreateInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrActionSpaceCreateInfo createSafe(long address) {
        return address == NULL ? null : wrap(XrActionSpaceCreateInfo.class, address);
    }

    /**
     * Returns a new {@link XrActionSpaceCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrActionSpaceCreateInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrActionSpaceCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrActionSpaceCreateInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrActionSpaceCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrActionSpaceCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrActionSpaceCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrActionSpaceCreateInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrActionSpaceCreateInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrActionSpaceCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrActionSpaceCreateInfo malloc(MemoryStack stack) {
        return wrap(XrActionSpaceCreateInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrActionSpaceCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrActionSpaceCreateInfo calloc(MemoryStack stack) {
        return wrap(XrActionSpaceCreateInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrActionSpaceCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrActionSpaceCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrActionSpaceCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrActionSpaceCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrActionSpaceCreateInfo.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrActionSpaceCreateInfo.NEXT); }
    /** Unsafe version of {@link #action}. */
    public static long naction(long struct) { return memGetAddress(struct + XrActionSpaceCreateInfo.ACTION); }
    /** Unsafe version of {@link #subactionPath}. */
    public static long nsubactionPath(long struct) { return UNSAFE.getLong(null, struct + XrActionSpaceCreateInfo.SUBACTIONPATH); }
    /** Unsafe version of {@link #poseInActionSpace}. */
    public static XrPosef nposeInActionSpace(long struct) { return XrPosef.create(struct + XrActionSpaceCreateInfo.POSEINACTIONSPACE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrActionSpaceCreateInfo.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrActionSpaceCreateInfo.NEXT, value); }
    /** Unsafe version of {@link #action(XrAction) action}. */
    public static void naction(long struct, XrAction value) { memPutAddress(struct + XrActionSpaceCreateInfo.ACTION, value.address()); }
    /** Unsafe version of {@link #subactionPath(long) subactionPath}. */
    public static void nsubactionPath(long struct, long value) { UNSAFE.putLong(null, struct + XrActionSpaceCreateInfo.SUBACTIONPATH, value); }
    /** Unsafe version of {@link #poseInActionSpace(XrPosef) poseInActionSpace}. */
    public static void nposeInActionSpace(long struct, XrPosef value) { memCopy(value.address(), struct + XrActionSpaceCreateInfo.POSEINACTIONSPACE, XrPosef.SIZEOF); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrActionSpaceCreateInfo.ACTION));
    }

    // -----------------------------------

    /** An array of {@link XrActionSpaceCreateInfo} structs. */
    public static class Buffer extends StructBuffer<XrActionSpaceCreateInfo, Buffer> implements NativeResource {

        private static final XrActionSpaceCreateInfo ELEMENT_FACTORY = XrActionSpaceCreateInfo.create(-1L);

        /**
         * Creates a new {@code XrActionSpaceCreateInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrActionSpaceCreateInfo#SIZEOF}, and its mark will be undefined.
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
        protected XrActionSpaceCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrActionSpaceCreateInfo#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrActionSpaceCreateInfo.ntype(address()); }
        /** @return the value of the {@link XrActionSpaceCreateInfo#next} field. */
        @NativeType("void const *")
        public long next() { return XrActionSpaceCreateInfo.nnext(address()); }
        /** @return the value of the {@link XrActionSpaceCreateInfo#action} field. */
        @NativeType("XrAction")
        public long action() { return XrActionSpaceCreateInfo.naction(address()); }
        /** @return the value of the {@link XrActionSpaceCreateInfo#subactionPath} field. */
        @NativeType("XrPath")
        public long subactionPath() { return XrActionSpaceCreateInfo.nsubactionPath(address()); }
        /** @return a {@link XrPosef} view of the {@link XrActionSpaceCreateInfo#poseInActionSpace} field. */
        public XrPosef poseInActionSpace() { return XrActionSpaceCreateInfo.nposeInActionSpace(address()); }

        /** Sets the specified value to the {@link XrActionSpaceCreateInfo#type} field. */
        public XrActionSpaceCreateInfo.Buffer type(@NativeType("XrStructureType") int value) { XrActionSpaceCreateInfo.ntype(address(), value); return this; }
        /** Sets the {@link XR10#XR_TYPE_ACTION_SPACE_CREATE_INFO TYPE_ACTION_SPACE_CREATE_INFO} value to the {@link XrActionSpaceCreateInfo#type} field. */
        public XrActionSpaceCreateInfo.Buffer type$Default() { return type(XR10.XR_TYPE_ACTION_SPACE_CREATE_INFO); }
        /** Sets the specified value to the {@link XrActionSpaceCreateInfo#next} field. */
        public XrActionSpaceCreateInfo.Buffer next(@NativeType("void const *") long value) { XrActionSpaceCreateInfo.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrActionSpaceCreateInfo#action} field. */
        public XrActionSpaceCreateInfo.Buffer action(XrAction value) { XrActionSpaceCreateInfo.naction(address(), value); return this; }
        /** Sets the specified value to the {@link XrActionSpaceCreateInfo#subactionPath} field. */
        public XrActionSpaceCreateInfo.Buffer subactionPath(@NativeType("XrPath") long value) { XrActionSpaceCreateInfo.nsubactionPath(address(), value); return this; }
        /** Copies the specified {@link XrPosef} to the {@link XrActionSpaceCreateInfo#poseInActionSpace} field. */
        public XrActionSpaceCreateInfo.Buffer poseInActionSpace(XrPosef value) { XrActionSpaceCreateInfo.nposeInActionSpace(address(), value); return this; }
        /** Passes the {@link XrActionSpaceCreateInfo#poseInActionSpace} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrActionSpaceCreateInfo.Buffer poseInActionSpace(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(poseInActionSpace()); return this; }

    }

}