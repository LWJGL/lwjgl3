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
 * Block Request Completion Info.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link MLWorldMeshDetection XR_ML_world_mesh_detection} extension <b>must</b> be enabled prior to using {@link XrWorldMeshRequestCompletionInfoML}</li>
 * <li>{@code type} <b>must</b> be {@link MLWorldMeshDetection#XR_TYPE_WORLD_MESH_REQUEST_COMPLETION_INFO_ML TYPE_WORLD_MESH_REQUEST_COMPLETION_INFO_ML}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code meshSpace} <b>must</b> be a valid {@code XrSpace} handle</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link MLWorldMeshDetection#xrRequestWorldMeshCompleteML RequestWorldMeshCompleteML}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrWorldMeshRequestCompletionInfoML {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrSpace {@link #meshSpace};
 *     XrTime {@link #meshSpaceLocateTime};
 * }</code></pre>
 */
public class XrWorldMeshRequestCompletionInfoML extends Struct<XrWorldMeshRequestCompletionInfoML> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        MESHSPACE,
        MESHSPACELOCATETIME;

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
        MESHSPACE = layout.offsetof(2);
        MESHSPACELOCATETIME = layout.offsetof(3);
    }

    protected XrWorldMeshRequestCompletionInfoML(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrWorldMeshRequestCompletionInfoML create(long address, @Nullable ByteBuffer container) {
        return new XrWorldMeshRequestCompletionInfoML(address, container);
    }

    /**
     * Creates a {@code XrWorldMeshRequestCompletionInfoML} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrWorldMeshRequestCompletionInfoML(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** the space used to express the vertex data in. */
    @NativeType("XrSpace")
    public long meshSpace() { return nmeshSpace(address()); }
    /** the time used to locate the {@code meshSpace}. */
    @NativeType("XrTime")
    public long meshSpaceLocateTime() { return nmeshSpaceLocateTime(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrWorldMeshRequestCompletionInfoML type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MLWorldMeshDetection#XR_TYPE_WORLD_MESH_REQUEST_COMPLETION_INFO_ML TYPE_WORLD_MESH_REQUEST_COMPLETION_INFO_ML} value to the {@link #type} field. */
    public XrWorldMeshRequestCompletionInfoML type$Default() { return type(MLWorldMeshDetection.XR_TYPE_WORLD_MESH_REQUEST_COMPLETION_INFO_ML); }
    /** Sets the specified value to the {@link #next} field. */
    public XrWorldMeshRequestCompletionInfoML next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #meshSpace} field. */
    public XrWorldMeshRequestCompletionInfoML meshSpace(XrSpace value) { nmeshSpace(address(), value); return this; }
    /** Sets the specified value to the {@link #meshSpaceLocateTime} field. */
    public XrWorldMeshRequestCompletionInfoML meshSpaceLocateTime(@NativeType("XrTime") long value) { nmeshSpaceLocateTime(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrWorldMeshRequestCompletionInfoML set(
        int type,
        long next,
        XrSpace meshSpace,
        long meshSpaceLocateTime
    ) {
        type(type);
        next(next);
        meshSpace(meshSpace);
        meshSpaceLocateTime(meshSpaceLocateTime);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrWorldMeshRequestCompletionInfoML set(XrWorldMeshRequestCompletionInfoML src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrWorldMeshRequestCompletionInfoML} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrWorldMeshRequestCompletionInfoML malloc() {
        return new XrWorldMeshRequestCompletionInfoML(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrWorldMeshRequestCompletionInfoML} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrWorldMeshRequestCompletionInfoML calloc() {
        return new XrWorldMeshRequestCompletionInfoML(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrWorldMeshRequestCompletionInfoML} instance allocated with {@link BufferUtils}. */
    public static XrWorldMeshRequestCompletionInfoML create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrWorldMeshRequestCompletionInfoML(memAddress(container), container);
    }

    /** Returns a new {@code XrWorldMeshRequestCompletionInfoML} instance for the specified memory address. */
    public static XrWorldMeshRequestCompletionInfoML create(long address) {
        return new XrWorldMeshRequestCompletionInfoML(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrWorldMeshRequestCompletionInfoML createSafe(long address) {
        return address == NULL ? null : new XrWorldMeshRequestCompletionInfoML(address, null);
    }

    /**
     * Returns a new {@link XrWorldMeshRequestCompletionInfoML.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshRequestCompletionInfoML.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrWorldMeshRequestCompletionInfoML.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshRequestCompletionInfoML.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrWorldMeshRequestCompletionInfoML.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshRequestCompletionInfoML.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrWorldMeshRequestCompletionInfoML.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshRequestCompletionInfoML.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrWorldMeshRequestCompletionInfoML.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrWorldMeshRequestCompletionInfoML} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrWorldMeshRequestCompletionInfoML malloc(MemoryStack stack) {
        return new XrWorldMeshRequestCompletionInfoML(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrWorldMeshRequestCompletionInfoML} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrWorldMeshRequestCompletionInfoML calloc(MemoryStack stack) {
        return new XrWorldMeshRequestCompletionInfoML(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrWorldMeshRequestCompletionInfoML.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshRequestCompletionInfoML.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrWorldMeshRequestCompletionInfoML.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshRequestCompletionInfoML.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrWorldMeshRequestCompletionInfoML.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrWorldMeshRequestCompletionInfoML.NEXT); }
    /** Unsafe version of {@link #meshSpace}. */
    public static long nmeshSpace(long struct) { return memGetAddress(struct + XrWorldMeshRequestCompletionInfoML.MESHSPACE); }
    /** Unsafe version of {@link #meshSpaceLocateTime}. */
    public static long nmeshSpaceLocateTime(long struct) { return UNSAFE.getLong(null, struct + XrWorldMeshRequestCompletionInfoML.MESHSPACELOCATETIME); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrWorldMeshRequestCompletionInfoML.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrWorldMeshRequestCompletionInfoML.NEXT, value); }
    /** Unsafe version of {@link #meshSpace(XrSpace) meshSpace}. */
    public static void nmeshSpace(long struct, XrSpace value) { memPutAddress(struct + XrWorldMeshRequestCompletionInfoML.MESHSPACE, value.address()); }
    /** Unsafe version of {@link #meshSpaceLocateTime(long) meshSpaceLocateTime}. */
    public static void nmeshSpaceLocateTime(long struct, long value) { UNSAFE.putLong(null, struct + XrWorldMeshRequestCompletionInfoML.MESHSPACELOCATETIME, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrWorldMeshRequestCompletionInfoML.MESHSPACE));
    }

    // -----------------------------------

    /** An array of {@link XrWorldMeshRequestCompletionInfoML} structs. */
    public static class Buffer extends StructBuffer<XrWorldMeshRequestCompletionInfoML, Buffer> implements NativeResource {

        private static final XrWorldMeshRequestCompletionInfoML ELEMENT_FACTORY = XrWorldMeshRequestCompletionInfoML.create(-1L);

        /**
         * Creates a new {@code XrWorldMeshRequestCompletionInfoML.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrWorldMeshRequestCompletionInfoML#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected XrWorldMeshRequestCompletionInfoML getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrWorldMeshRequestCompletionInfoML#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrWorldMeshRequestCompletionInfoML.ntype(address()); }
        /** @return the value of the {@link XrWorldMeshRequestCompletionInfoML#next} field. */
        @NativeType("void const *")
        public long next() { return XrWorldMeshRequestCompletionInfoML.nnext(address()); }
        /** @return the value of the {@link XrWorldMeshRequestCompletionInfoML#meshSpace} field. */
        @NativeType("XrSpace")
        public long meshSpace() { return XrWorldMeshRequestCompletionInfoML.nmeshSpace(address()); }
        /** @return the value of the {@link XrWorldMeshRequestCompletionInfoML#meshSpaceLocateTime} field. */
        @NativeType("XrTime")
        public long meshSpaceLocateTime() { return XrWorldMeshRequestCompletionInfoML.nmeshSpaceLocateTime(address()); }

        /** Sets the specified value to the {@link XrWorldMeshRequestCompletionInfoML#type} field. */
        public XrWorldMeshRequestCompletionInfoML.Buffer type(@NativeType("XrStructureType") int value) { XrWorldMeshRequestCompletionInfoML.ntype(address(), value); return this; }
        /** Sets the {@link MLWorldMeshDetection#XR_TYPE_WORLD_MESH_REQUEST_COMPLETION_INFO_ML TYPE_WORLD_MESH_REQUEST_COMPLETION_INFO_ML} value to the {@link XrWorldMeshRequestCompletionInfoML#type} field. */
        public XrWorldMeshRequestCompletionInfoML.Buffer type$Default() { return type(MLWorldMeshDetection.XR_TYPE_WORLD_MESH_REQUEST_COMPLETION_INFO_ML); }
        /** Sets the specified value to the {@link XrWorldMeshRequestCompletionInfoML#next} field. */
        public XrWorldMeshRequestCompletionInfoML.Buffer next(@NativeType("void const *") long value) { XrWorldMeshRequestCompletionInfoML.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrWorldMeshRequestCompletionInfoML#meshSpace} field. */
        public XrWorldMeshRequestCompletionInfoML.Buffer meshSpace(XrSpace value) { XrWorldMeshRequestCompletionInfoML.nmeshSpace(address(), value); return this; }
        /** Sets the specified value to the {@link XrWorldMeshRequestCompletionInfoML#meshSpaceLocateTime} field. */
        public XrWorldMeshRequestCompletionInfoML.Buffer meshSpaceLocateTime(@NativeType("XrTime") long value) { XrWorldMeshRequestCompletionInfoML.nmeshSpaceLocateTime(address(), value); return this; }

    }

}