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
 * Block Request Completion.
 * 
 * <h5>Future Return Codes</h5>
 * 
 * <p>{@code futureResult} values:</p>
 * 
 * <dl>
 * <dt><a href="https://registry.khronos.org/OpenXR/specs/1.1/html/xrspec.html#fundamentals-successcodes">Success</a></dt>
 * <dd><ul>
 * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
 * <li>{@link XR10#XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
 * </ul></dd>
 * <dt><a href="https://registry.khronos.org/OpenXR/specs/1.1/html/xrspec.html#fundamentals-errorcodes">Failure</a></dt>
 * <dd><ul>
 * <li>{@link XR10#XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
 * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
 * <li>{@link XR10#XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
 * <li>{@link XR10#XR_ERROR_OUT_OF_MEMORY ERROR_OUT_OF_MEMORY}</li>
 * <li>{@link XR10#XR_ERROR_LIMIT_REACHED ERROR_LIMIT_REACHED}</li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link MLWorldMeshDetection XR_ML_world_mesh_detection} extension <b>must</b> be enabled prior to using {@link XrWorldMeshRequestCompletionML}</li>
 * <li>{@code type} <b>must</b> be {@link MLWorldMeshDetection#XR_TYPE_WORLD_MESH_REQUEST_COMPLETION_ML TYPE_WORLD_MESH_REQUEST_COMPLETION_ML}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code futureResult} <b>must</b> be a valid {@code XrResult} value</li>
 * <li>{@code blocks} <b>must</b> be a pointer to an array of {@code blockCount} {@link XrWorldMeshBlockML} structures</li>
 * <li>The {@code blockCount} parameter <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrWorldMeshBlockML}, {@link MLWorldMeshDetection#xrRequestWorldMeshCompleteML RequestWorldMeshCompleteML}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrWorldMeshRequestCompletionML {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     XrResult {@link #futureResult};
 *     uint32_t {@link #blockCount};
 *     {@link XrWorldMeshBlockML XrWorldMeshBlockML} * {@link #blocks};
 * }</code></pre>
 */
public class XrWorldMeshRequestCompletionML extends Struct<XrWorldMeshRequestCompletionML> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        FUTURERESULT,
        BLOCKCOUNT,
        BLOCKS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        FUTURERESULT = layout.offsetof(2);
        BLOCKCOUNT = layout.offsetof(3);
        BLOCKS = layout.offsetof(4);
    }

    protected XrWorldMeshRequestCompletionML(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrWorldMeshRequestCompletionML create(long address, @Nullable ByteBuffer container) {
        return new XrWorldMeshRequestCompletionML(address, container);
    }

    /**
     * Creates a {@code XrWorldMeshRequestCompletionML} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrWorldMeshRequestCompletionML(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** the {@code XrResult} of the asynchronous operation. */
    @NativeType("XrResult")
    public int futureResult() { return nfutureResult(address()); }
    /** a {@code uint32_t} that <b>must</b> match {@link XrWorldMeshGetInfoML}::blockCount parameter. */
    @NativeType("uint32_t")
    public int blockCount() { return nblockCount(address()); }
    /** an array of {@link XrWorldMeshBlockML} structures containing the vertex data pointers. */
    @NativeType("XrWorldMeshBlockML *")
    public XrWorldMeshBlockML.Buffer blocks() { return nblocks(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrWorldMeshRequestCompletionML type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MLWorldMeshDetection#XR_TYPE_WORLD_MESH_REQUEST_COMPLETION_ML TYPE_WORLD_MESH_REQUEST_COMPLETION_ML} value to the {@link #type} field. */
    public XrWorldMeshRequestCompletionML type$Default() { return type(MLWorldMeshDetection.XR_TYPE_WORLD_MESH_REQUEST_COMPLETION_ML); }
    /** Sets the specified value to the {@link #next} field. */
    public XrWorldMeshRequestCompletionML next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #futureResult} field. */
    public XrWorldMeshRequestCompletionML futureResult(@NativeType("XrResult") int value) { nfutureResult(address(), value); return this; }
    /** Sets the address of the specified {@link XrWorldMeshBlockML.Buffer} to the {@link #blocks} field. */
    public XrWorldMeshRequestCompletionML blocks(@NativeType("XrWorldMeshBlockML *") XrWorldMeshBlockML.Buffer value) { nblocks(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrWorldMeshRequestCompletionML set(
        int type,
        long next,
        int futureResult,
        XrWorldMeshBlockML.Buffer blocks
    ) {
        type(type);
        next(next);
        futureResult(futureResult);
        blocks(blocks);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrWorldMeshRequestCompletionML set(XrWorldMeshRequestCompletionML src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrWorldMeshRequestCompletionML} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrWorldMeshRequestCompletionML malloc() {
        return new XrWorldMeshRequestCompletionML(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrWorldMeshRequestCompletionML} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrWorldMeshRequestCompletionML calloc() {
        return new XrWorldMeshRequestCompletionML(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrWorldMeshRequestCompletionML} instance allocated with {@link BufferUtils}. */
    public static XrWorldMeshRequestCompletionML create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrWorldMeshRequestCompletionML(memAddress(container), container);
    }

    /** Returns a new {@code XrWorldMeshRequestCompletionML} instance for the specified memory address. */
    public static XrWorldMeshRequestCompletionML create(long address) {
        return new XrWorldMeshRequestCompletionML(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrWorldMeshRequestCompletionML createSafe(long address) {
        return address == NULL ? null : new XrWorldMeshRequestCompletionML(address, null);
    }

    /** Downcasts the specified {@code XrFutureCompletionBaseHeaderEXT} instance to {@code XrWorldMeshRequestCompletionML}. */
    public static XrWorldMeshRequestCompletionML create(XrFutureCompletionBaseHeaderEXT value) {
        return new XrWorldMeshRequestCompletionML(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrWorldMeshRequestCompletionML.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshRequestCompletionML.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrWorldMeshRequestCompletionML.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshRequestCompletionML.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrWorldMeshRequestCompletionML.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshRequestCompletionML.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrWorldMeshRequestCompletionML.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshRequestCompletionML.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrWorldMeshRequestCompletionML.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrFutureCompletionBaseHeaderEXT.Buffer} instance to {@code XrWorldMeshRequestCompletionML.Buffer}. */
    public static XrWorldMeshRequestCompletionML.Buffer create(XrFutureCompletionBaseHeaderEXT.Buffer value) {
        return new XrWorldMeshRequestCompletionML.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrWorldMeshRequestCompletionML} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrWorldMeshRequestCompletionML malloc(MemoryStack stack) {
        return new XrWorldMeshRequestCompletionML(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrWorldMeshRequestCompletionML} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrWorldMeshRequestCompletionML calloc(MemoryStack stack) {
        return new XrWorldMeshRequestCompletionML(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrWorldMeshRequestCompletionML.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshRequestCompletionML.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrWorldMeshRequestCompletionML.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshRequestCompletionML.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrWorldMeshRequestCompletionML.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrWorldMeshRequestCompletionML.NEXT); }
    /** Unsafe version of {@link #futureResult}. */
    public static int nfutureResult(long struct) { return UNSAFE.getInt(null, struct + XrWorldMeshRequestCompletionML.FUTURERESULT); }
    /** Unsafe version of {@link #blockCount}. */
    public static int nblockCount(long struct) { return UNSAFE.getInt(null, struct + XrWorldMeshRequestCompletionML.BLOCKCOUNT); }
    /** Unsafe version of {@link #blocks}. */
    public static XrWorldMeshBlockML.Buffer nblocks(long struct) { return XrWorldMeshBlockML.create(memGetAddress(struct + XrWorldMeshRequestCompletionML.BLOCKS), nblockCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrWorldMeshRequestCompletionML.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrWorldMeshRequestCompletionML.NEXT, value); }
    /** Unsafe version of {@link #futureResult(int) futureResult}. */
    public static void nfutureResult(long struct, int value) { UNSAFE.putInt(null, struct + XrWorldMeshRequestCompletionML.FUTURERESULT, value); }
    /** Sets the specified value to the {@code blockCount} field of the specified {@code struct}. */
    public static void nblockCount(long struct, int value) { UNSAFE.putInt(null, struct + XrWorldMeshRequestCompletionML.BLOCKCOUNT, value); }
    /** Unsafe version of {@link #blocks(XrWorldMeshBlockML.Buffer) blocks}. */
    public static void nblocks(long struct, XrWorldMeshBlockML.Buffer value) { memPutAddress(struct + XrWorldMeshRequestCompletionML.BLOCKS, value.address()); nblockCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        int blockCount = nblockCount(struct);
        long blocks = memGetAddress(struct + XrWorldMeshRequestCompletionML.BLOCKS);
        check(blocks);
        validate(blocks, blockCount, XrWorldMeshBlockML.SIZEOF, XrWorldMeshBlockML::validate);
    }

    // -----------------------------------

    /** An array of {@link XrWorldMeshRequestCompletionML} structs. */
    public static class Buffer extends StructBuffer<XrWorldMeshRequestCompletionML, Buffer> implements NativeResource {

        private static final XrWorldMeshRequestCompletionML ELEMENT_FACTORY = XrWorldMeshRequestCompletionML.create(-1L);

        /**
         * Creates a new {@code XrWorldMeshRequestCompletionML.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrWorldMeshRequestCompletionML#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrWorldMeshRequestCompletionML getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrWorldMeshRequestCompletionML#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrWorldMeshRequestCompletionML.ntype(address()); }
        /** @return the value of the {@link XrWorldMeshRequestCompletionML#next} field. */
        @NativeType("void *")
        public long next() { return XrWorldMeshRequestCompletionML.nnext(address()); }
        /** @return the value of the {@link XrWorldMeshRequestCompletionML#futureResult} field. */
        @NativeType("XrResult")
        public int futureResult() { return XrWorldMeshRequestCompletionML.nfutureResult(address()); }
        /** @return the value of the {@link XrWorldMeshRequestCompletionML#blockCount} field. */
        @NativeType("uint32_t")
        public int blockCount() { return XrWorldMeshRequestCompletionML.nblockCount(address()); }
        /** @return a {@link XrWorldMeshBlockML.Buffer} view of the struct array pointed to by the {@link XrWorldMeshRequestCompletionML#blocks} field. */
        @NativeType("XrWorldMeshBlockML *")
        public XrWorldMeshBlockML.Buffer blocks() { return XrWorldMeshRequestCompletionML.nblocks(address()); }

        /** Sets the specified value to the {@link XrWorldMeshRequestCompletionML#type} field. */
        public XrWorldMeshRequestCompletionML.Buffer type(@NativeType("XrStructureType") int value) { XrWorldMeshRequestCompletionML.ntype(address(), value); return this; }
        /** Sets the {@link MLWorldMeshDetection#XR_TYPE_WORLD_MESH_REQUEST_COMPLETION_ML TYPE_WORLD_MESH_REQUEST_COMPLETION_ML} value to the {@link XrWorldMeshRequestCompletionML#type} field. */
        public XrWorldMeshRequestCompletionML.Buffer type$Default() { return type(MLWorldMeshDetection.XR_TYPE_WORLD_MESH_REQUEST_COMPLETION_ML); }
        /** Sets the specified value to the {@link XrWorldMeshRequestCompletionML#next} field. */
        public XrWorldMeshRequestCompletionML.Buffer next(@NativeType("void *") long value) { XrWorldMeshRequestCompletionML.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrWorldMeshRequestCompletionML#futureResult} field. */
        public XrWorldMeshRequestCompletionML.Buffer futureResult(@NativeType("XrResult") int value) { XrWorldMeshRequestCompletionML.nfutureResult(address(), value); return this; }
        /** Sets the address of the specified {@link XrWorldMeshBlockML.Buffer} to the {@link XrWorldMeshRequestCompletionML#blocks} field. */
        public XrWorldMeshRequestCompletionML.Buffer blocks(@NativeType("XrWorldMeshBlockML *") XrWorldMeshBlockML.Buffer value) { XrWorldMeshRequestCompletionML.nblocks(address(), value); return this; }

    }

}