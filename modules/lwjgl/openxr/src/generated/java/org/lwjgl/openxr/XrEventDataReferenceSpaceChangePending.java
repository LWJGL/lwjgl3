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
 * Notifies the application that a reference space is changing.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code type} <b>must</b> be {@link XR10#XR_TYPE_EVENT_DATA_REFERENCE_SPACE_CHANGE_PENDING TYPE_EVENT_DATA_REFERENCE_SPACE_CHANGE_PENDING}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
 * <li>{@code referenceSpaceType} <b>must</b> be a valid {@code XrReferenceSpaceType} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrPosef}, {@link XR10#xrCreateReferenceSpace CreateReferenceSpace}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrEventDataReferenceSpaceChangePending {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrSession {@link #session};
 *     XrReferenceSpaceType {@link #referenceSpaceType};
 *     XrTime {@link #changeTime};
 *     XrBool32 {@link #poseValid};
 *     {@link XrPosef XrPosef} {@link #poseInPreviousSpace};
 * }</code></pre>
 */
public class XrEventDataReferenceSpaceChangePending extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SESSION,
        REFERENCESPACETYPE,
        CHANGETIME,
        POSEVALID,
        POSEINPREVIOUSSPACE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(8),
            __member(4),
            __member(XrPosef.SIZEOF, XrPosef.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SESSION = layout.offsetof(2);
        REFERENCESPACETYPE = layout.offsetof(3);
        CHANGETIME = layout.offsetof(4);
        POSEVALID = layout.offsetof(5);
        POSEINPREVIOUSSPACE = layout.offsetof(6);
    }

    /**
     * Creates a {@code XrEventDataReferenceSpaceChangePending} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrEventDataReferenceSpaceChangePending(ByteBuffer container) {
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
    /** the {@code XrSession} for which the reference space is changing. */
    @NativeType("XrSession")
    public long session() { return nsession(address()); }
    /** the {@code XrReferenceSpaceType} that is changing. */
    @NativeType("XrReferenceSpaceType")
    public int referenceSpaceType() { return nreferenceSpaceType(address()); }
    /** the target {@code XrTime} after which {@link XR10#xrLocateSpace LocateSpace} or {@link XR10#xrLocateViews LocateViews} will return values that respect this change. */
    @NativeType("XrTime")
    public long changeTime() { return nchangeTime(address()); }
    /** true if the runtime can determine the {@code pose} of the new space in the previous space before the change. */
    @NativeType("XrBool32")
    public boolean poseValid() { return nposeValid(address()) != 0; }
    /** an {@link XrPosef} defining the position and orientation of the new reference space’s natural origin within the natural reference frame of its previous space. */
    public XrPosef poseInPreviousSpace() { return nposeInPreviousSpace(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrEventDataReferenceSpaceChangePending type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link XR10#XR_TYPE_EVENT_DATA_REFERENCE_SPACE_CHANGE_PENDING TYPE_EVENT_DATA_REFERENCE_SPACE_CHANGE_PENDING} value to the {@link #type} field. */
    public XrEventDataReferenceSpaceChangePending type$Default() { return type(XR10.XR_TYPE_EVENT_DATA_REFERENCE_SPACE_CHANGE_PENDING); }
    /** Sets the specified value to the {@link #next} field. */
    public XrEventDataReferenceSpaceChangePending next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #session} field. */
    public XrEventDataReferenceSpaceChangePending session(XrSession value) { nsession(address(), value); return this; }
    /** Sets the specified value to the {@link #referenceSpaceType} field. */
    public XrEventDataReferenceSpaceChangePending referenceSpaceType(@NativeType("XrReferenceSpaceType") int value) { nreferenceSpaceType(address(), value); return this; }
    /** Sets the specified value to the {@link #changeTime} field. */
    public XrEventDataReferenceSpaceChangePending changeTime(@NativeType("XrTime") long value) { nchangeTime(address(), value); return this; }
    /** Sets the specified value to the {@link #poseValid} field. */
    public XrEventDataReferenceSpaceChangePending poseValid(@NativeType("XrBool32") boolean value) { nposeValid(address(), value ? 1 : 0); return this; }
    /** Copies the specified {@link XrPosef} to the {@link #poseInPreviousSpace} field. */
    public XrEventDataReferenceSpaceChangePending poseInPreviousSpace(XrPosef value) { nposeInPreviousSpace(address(), value); return this; }
    /** Passes the {@link #poseInPreviousSpace} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrEventDataReferenceSpaceChangePending poseInPreviousSpace(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(poseInPreviousSpace()); return this; }

    /** Initializes this struct with the specified values. */
    public XrEventDataReferenceSpaceChangePending set(
        int type,
        long next,
        XrSession session,
        int referenceSpaceType,
        long changeTime,
        boolean poseValid,
        XrPosef poseInPreviousSpace
    ) {
        type(type);
        next(next);
        session(session);
        referenceSpaceType(referenceSpaceType);
        changeTime(changeTime);
        poseValid(poseValid);
        poseInPreviousSpace(poseInPreviousSpace);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrEventDataReferenceSpaceChangePending set(XrEventDataReferenceSpaceChangePending src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrEventDataReferenceSpaceChangePending} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrEventDataReferenceSpaceChangePending malloc() {
        return wrap(XrEventDataReferenceSpaceChangePending.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrEventDataReferenceSpaceChangePending} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEventDataReferenceSpaceChangePending calloc() {
        return wrap(XrEventDataReferenceSpaceChangePending.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrEventDataReferenceSpaceChangePending} instance allocated with {@link BufferUtils}. */
    public static XrEventDataReferenceSpaceChangePending create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrEventDataReferenceSpaceChangePending.class, memAddress(container), container);
    }

    /** Returns a new {@code XrEventDataReferenceSpaceChangePending} instance for the specified memory address. */
    public static XrEventDataReferenceSpaceChangePending create(long address) {
        return wrap(XrEventDataReferenceSpaceChangePending.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrEventDataReferenceSpaceChangePending createSafe(long address) {
        return address == NULL ? null : wrap(XrEventDataReferenceSpaceChangePending.class, address);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader} instance to {@code XrEventDataReferenceSpaceChangePending}. */
    public static XrEventDataReferenceSpaceChangePending create(XrEventDataBaseHeader value) {
        return wrap(XrEventDataReferenceSpaceChangePending.class, value);
    }

    /**
     * Returns a new {@link XrEventDataReferenceSpaceChangePending.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataReferenceSpaceChangePending.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEventDataReferenceSpaceChangePending.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataReferenceSpaceChangePending.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataReferenceSpaceChangePending.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataReferenceSpaceChangePending.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrEventDataReferenceSpaceChangePending.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEventDataReferenceSpaceChangePending.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrEventDataReferenceSpaceChangePending.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader.Buffer} instance to {@code XrEventDataReferenceSpaceChangePending.Buffer}. */
    public static XrEventDataReferenceSpaceChangePending.Buffer create(XrEventDataBaseHeader.Buffer value) {
        return wrap(Buffer.class, value);
    }

    /**
     * Returns a new {@code XrEventDataReferenceSpaceChangePending} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataReferenceSpaceChangePending malloc(MemoryStack stack) {
        return wrap(XrEventDataReferenceSpaceChangePending.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrEventDataReferenceSpaceChangePending} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataReferenceSpaceChangePending calloc(MemoryStack stack) {
        return wrap(XrEventDataReferenceSpaceChangePending.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrEventDataReferenceSpaceChangePending.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataReferenceSpaceChangePending.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataReferenceSpaceChangePending.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataReferenceSpaceChangePending.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrEventDataReferenceSpaceChangePending.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEventDataReferenceSpaceChangePending.NEXT); }
    /** Unsafe version of {@link #session}. */
    public static long nsession(long struct) { return memGetAddress(struct + XrEventDataReferenceSpaceChangePending.SESSION); }
    /** Unsafe version of {@link #referenceSpaceType}. */
    public static int nreferenceSpaceType(long struct) { return UNSAFE.getInt(null, struct + XrEventDataReferenceSpaceChangePending.REFERENCESPACETYPE); }
    /** Unsafe version of {@link #changeTime}. */
    public static long nchangeTime(long struct) { return UNSAFE.getLong(null, struct + XrEventDataReferenceSpaceChangePending.CHANGETIME); }
    /** Unsafe version of {@link #poseValid}. */
    public static int nposeValid(long struct) { return UNSAFE.getInt(null, struct + XrEventDataReferenceSpaceChangePending.POSEVALID); }
    /** Unsafe version of {@link #poseInPreviousSpace}. */
    public static XrPosef nposeInPreviousSpace(long struct) { return XrPosef.create(struct + XrEventDataReferenceSpaceChangePending.POSEINPREVIOUSSPACE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrEventDataReferenceSpaceChangePending.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEventDataReferenceSpaceChangePending.NEXT, value); }
    /** Unsafe version of {@link #session(XrSession) session}. */
    public static void nsession(long struct, XrSession value) { memPutAddress(struct + XrEventDataReferenceSpaceChangePending.SESSION, value.address()); }
    /** Unsafe version of {@link #referenceSpaceType(int) referenceSpaceType}. */
    public static void nreferenceSpaceType(long struct, int value) { UNSAFE.putInt(null, struct + XrEventDataReferenceSpaceChangePending.REFERENCESPACETYPE, value); }
    /** Unsafe version of {@link #changeTime(long) changeTime}. */
    public static void nchangeTime(long struct, long value) { UNSAFE.putLong(null, struct + XrEventDataReferenceSpaceChangePending.CHANGETIME, value); }
    /** Unsafe version of {@link #poseValid(boolean) poseValid}. */
    public static void nposeValid(long struct, int value) { UNSAFE.putInt(null, struct + XrEventDataReferenceSpaceChangePending.POSEVALID, value); }
    /** Unsafe version of {@link #poseInPreviousSpace(XrPosef) poseInPreviousSpace}. */
    public static void nposeInPreviousSpace(long struct, XrPosef value) { memCopy(value.address(), struct + XrEventDataReferenceSpaceChangePending.POSEINPREVIOUSSPACE, XrPosef.SIZEOF); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrEventDataReferenceSpaceChangePending.SESSION));
    }

    // -----------------------------------

    /** An array of {@link XrEventDataReferenceSpaceChangePending} structs. */
    public static class Buffer extends StructBuffer<XrEventDataReferenceSpaceChangePending, Buffer> implements NativeResource {

        private static final XrEventDataReferenceSpaceChangePending ELEMENT_FACTORY = XrEventDataReferenceSpaceChangePending.create(-1L);

        /**
         * Creates a new {@code XrEventDataReferenceSpaceChangePending.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEventDataReferenceSpaceChangePending#SIZEOF}, and its mark will be undefined.
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
        protected XrEventDataReferenceSpaceChangePending getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrEventDataReferenceSpaceChangePending#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEventDataReferenceSpaceChangePending.ntype(address()); }
        /** @return the value of the {@link XrEventDataReferenceSpaceChangePending#next} field. */
        @NativeType("void const *")
        public long next() { return XrEventDataReferenceSpaceChangePending.nnext(address()); }
        /** @return the value of the {@link XrEventDataReferenceSpaceChangePending#session} field. */
        @NativeType("XrSession")
        public long session() { return XrEventDataReferenceSpaceChangePending.nsession(address()); }
        /** @return the value of the {@link XrEventDataReferenceSpaceChangePending#referenceSpaceType} field. */
        @NativeType("XrReferenceSpaceType")
        public int referenceSpaceType() { return XrEventDataReferenceSpaceChangePending.nreferenceSpaceType(address()); }
        /** @return the value of the {@link XrEventDataReferenceSpaceChangePending#changeTime} field. */
        @NativeType("XrTime")
        public long changeTime() { return XrEventDataReferenceSpaceChangePending.nchangeTime(address()); }
        /** @return the value of the {@link XrEventDataReferenceSpaceChangePending#poseValid} field. */
        @NativeType("XrBool32")
        public boolean poseValid() { return XrEventDataReferenceSpaceChangePending.nposeValid(address()) != 0; }
        /** @return a {@link XrPosef} view of the {@link XrEventDataReferenceSpaceChangePending#poseInPreviousSpace} field. */
        public XrPosef poseInPreviousSpace() { return XrEventDataReferenceSpaceChangePending.nposeInPreviousSpace(address()); }

        /** Sets the specified value to the {@link XrEventDataReferenceSpaceChangePending#type} field. */
        public XrEventDataReferenceSpaceChangePending.Buffer type(@NativeType("XrStructureType") int value) { XrEventDataReferenceSpaceChangePending.ntype(address(), value); return this; }
        /** Sets the {@link XR10#XR_TYPE_EVENT_DATA_REFERENCE_SPACE_CHANGE_PENDING TYPE_EVENT_DATA_REFERENCE_SPACE_CHANGE_PENDING} value to the {@link XrEventDataReferenceSpaceChangePending#type} field. */
        public XrEventDataReferenceSpaceChangePending.Buffer type$Default() { return type(XR10.XR_TYPE_EVENT_DATA_REFERENCE_SPACE_CHANGE_PENDING); }
        /** Sets the specified value to the {@link XrEventDataReferenceSpaceChangePending#next} field. */
        public XrEventDataReferenceSpaceChangePending.Buffer next(@NativeType("void const *") long value) { XrEventDataReferenceSpaceChangePending.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrEventDataReferenceSpaceChangePending#session} field. */
        public XrEventDataReferenceSpaceChangePending.Buffer session(XrSession value) { XrEventDataReferenceSpaceChangePending.nsession(address(), value); return this; }
        /** Sets the specified value to the {@link XrEventDataReferenceSpaceChangePending#referenceSpaceType} field. */
        public XrEventDataReferenceSpaceChangePending.Buffer referenceSpaceType(@NativeType("XrReferenceSpaceType") int value) { XrEventDataReferenceSpaceChangePending.nreferenceSpaceType(address(), value); return this; }
        /** Sets the specified value to the {@link XrEventDataReferenceSpaceChangePending#changeTime} field. */
        public XrEventDataReferenceSpaceChangePending.Buffer changeTime(@NativeType("XrTime") long value) { XrEventDataReferenceSpaceChangePending.nchangeTime(address(), value); return this; }
        /** Sets the specified value to the {@link XrEventDataReferenceSpaceChangePending#poseValid} field. */
        public XrEventDataReferenceSpaceChangePending.Buffer poseValid(@NativeType("XrBool32") boolean value) { XrEventDataReferenceSpaceChangePending.nposeValid(address(), value ? 1 : 0); return this; }
        /** Copies the specified {@link XrPosef} to the {@link XrEventDataReferenceSpaceChangePending#poseInPreviousSpace} field. */
        public XrEventDataReferenceSpaceChangePending.Buffer poseInPreviousSpace(XrPosef value) { XrEventDataReferenceSpaceChangePending.nposeInPreviousSpace(address(), value); return this; }
        /** Passes the {@link XrEventDataReferenceSpaceChangePending#poseInPreviousSpace} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrEventDataReferenceSpaceChangePending.Buffer poseInPreviousSpace(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(poseInPreviousSpace()); return this; }

    }

}