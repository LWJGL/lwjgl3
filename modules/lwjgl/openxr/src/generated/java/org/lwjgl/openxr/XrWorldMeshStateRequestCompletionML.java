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
 * Mesh block detection info.
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
 * <li>{@link MLWorldMeshDetection#XR_ERROR_WORLD_MESH_DETECTOR_SPACE_NOT_LOCATABLE_ML ERROR_WORLD_MESH_DETECTOR_SPACE_NOT_LOCATABLE_ML}</li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link MLWorldMeshDetection XR_ML_world_mesh_detection} extension <b>must</b> be enabled prior to using {@link XrWorldMeshStateRequestCompletionML}</li>
 * <li>{@code type} <b>must</b> be {@link MLWorldMeshDetection#XR_TYPE_WORLD_MESH_STATE_REQUEST_COMPLETION_ML TYPE_WORLD_MESH_STATE_REQUEST_COMPLETION_ML}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code futureResult} <b>must</b> be a valid {@code XrResult} value</li>
 * <li>If {@code meshBlockStateCapacityInput} is not 0, {@code meshBlockStates} <b>must</b> be a pointer to an array of {@code meshBlockStateCapacityInput} {@link XrWorldMeshBlockStateML} structures</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrWorldMeshBlockStateML}, {@link MLWorldMeshDetection#xrRequestWorldMeshStateCompleteML RequestWorldMeshStateCompleteML}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrWorldMeshStateRequestCompletionML {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     XrResult {@link #futureResult};
 *     XrTime {@link #timestamp};
 *     uint32_t {@link #meshBlockStateCapacityInput};
 *     uint32_t {@link #meshBlockStateCountOutput};
 *     {@link XrWorldMeshBlockStateML XrWorldMeshBlockStateML} * {@link #meshBlockStates};
 * }</code></pre>
 */
public class XrWorldMeshStateRequestCompletionML extends Struct<XrWorldMeshStateRequestCompletionML> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        FUTURERESULT,
        TIMESTAMP,
        MESHBLOCKSTATECAPACITYINPUT,
        MESHBLOCKSTATECOUNTOUTPUT,
        MESHBLOCKSTATES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        FUTURERESULT = layout.offsetof(2);
        TIMESTAMP = layout.offsetof(3);
        MESHBLOCKSTATECAPACITYINPUT = layout.offsetof(4);
        MESHBLOCKSTATECOUNTOUTPUT = layout.offsetof(5);
        MESHBLOCKSTATES = layout.offsetof(6);
    }

    protected XrWorldMeshStateRequestCompletionML(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrWorldMeshStateRequestCompletionML create(long address, @Nullable ByteBuffer container) {
        return new XrWorldMeshStateRequestCompletionML(address, container);
    }

    /**
     * Creates a {@code XrWorldMeshStateRequestCompletionML} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrWorldMeshStateRequestCompletionML(ByteBuffer container) {
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
    /** the {@code XrTime} of the request. */
    @NativeType("XrTime")
    public long timestamp() { return ntimestamp(address()); }
    /** the capacity of the {@code meshBlockStates} array, or 0 to indicate a request to retrieve the required capacity. */
    @NativeType("uint32_t")
    public int meshBlockStateCapacityInput() { return nmeshBlockStateCapacityInput(address()); }
    /** filled in by the runtime with the count of mesh states written or the required capacity in the case that {@code meshBlockStateCapacityInput} is insufficient. */
    @NativeType("uint32_t")
    public int meshBlockStateCountOutput() { return nmeshBlockStateCountOutput(address()); }
    /** a pointer to an array of {@link XrWorldMeshBlockStateML}. */
    @Nullable
    @NativeType("XrWorldMeshBlockStateML *")
    public XrWorldMeshBlockStateML.Buffer meshBlockStates() { return nmeshBlockStates(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrWorldMeshStateRequestCompletionML type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MLWorldMeshDetection#XR_TYPE_WORLD_MESH_STATE_REQUEST_COMPLETION_ML TYPE_WORLD_MESH_STATE_REQUEST_COMPLETION_ML} value to the {@link #type} field. */
    public XrWorldMeshStateRequestCompletionML type$Default() { return type(MLWorldMeshDetection.XR_TYPE_WORLD_MESH_STATE_REQUEST_COMPLETION_ML); }
    /** Sets the specified value to the {@link #next} field. */
    public XrWorldMeshStateRequestCompletionML next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #futureResult} field. */
    public XrWorldMeshStateRequestCompletionML futureResult(@NativeType("XrResult") int value) { nfutureResult(address(), value); return this; }
    /** Sets the specified value to the {@link #timestamp} field. */
    public XrWorldMeshStateRequestCompletionML timestamp(@NativeType("XrTime") long value) { ntimestamp(address(), value); return this; }
    /** Sets the specified value to the {@link #meshBlockStateCapacityInput} field. */
    public XrWorldMeshStateRequestCompletionML meshBlockStateCapacityInput(@NativeType("uint32_t") int value) { nmeshBlockStateCapacityInput(address(), value); return this; }
    /** Sets the specified value to the {@link #meshBlockStateCountOutput} field. */
    public XrWorldMeshStateRequestCompletionML meshBlockStateCountOutput(@NativeType("uint32_t") int value) { nmeshBlockStateCountOutput(address(), value); return this; }
    /** Sets the address of the specified {@link XrWorldMeshBlockStateML.Buffer} to the {@link #meshBlockStates} field. */
    public XrWorldMeshStateRequestCompletionML meshBlockStates(@Nullable @NativeType("XrWorldMeshBlockStateML *") XrWorldMeshBlockStateML.Buffer value) { nmeshBlockStates(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrWorldMeshStateRequestCompletionML set(
        int type,
        long next,
        int futureResult,
        long timestamp,
        int meshBlockStateCapacityInput,
        int meshBlockStateCountOutput,
        @Nullable XrWorldMeshBlockStateML.Buffer meshBlockStates
    ) {
        type(type);
        next(next);
        futureResult(futureResult);
        timestamp(timestamp);
        meshBlockStateCapacityInput(meshBlockStateCapacityInput);
        meshBlockStateCountOutput(meshBlockStateCountOutput);
        meshBlockStates(meshBlockStates);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrWorldMeshStateRequestCompletionML set(XrWorldMeshStateRequestCompletionML src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrWorldMeshStateRequestCompletionML} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrWorldMeshStateRequestCompletionML malloc() {
        return new XrWorldMeshStateRequestCompletionML(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrWorldMeshStateRequestCompletionML} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrWorldMeshStateRequestCompletionML calloc() {
        return new XrWorldMeshStateRequestCompletionML(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrWorldMeshStateRequestCompletionML} instance allocated with {@link BufferUtils}. */
    public static XrWorldMeshStateRequestCompletionML create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrWorldMeshStateRequestCompletionML(memAddress(container), container);
    }

    /** Returns a new {@code XrWorldMeshStateRequestCompletionML} instance for the specified memory address. */
    public static XrWorldMeshStateRequestCompletionML create(long address) {
        return new XrWorldMeshStateRequestCompletionML(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrWorldMeshStateRequestCompletionML createSafe(long address) {
        return address == NULL ? null : new XrWorldMeshStateRequestCompletionML(address, null);
    }

    /** Downcasts the specified {@code XrFutureCompletionBaseHeaderEXT} instance to {@code XrWorldMeshStateRequestCompletionML}. */
    public static XrWorldMeshStateRequestCompletionML create(XrFutureCompletionBaseHeaderEXT value) {
        return new XrWorldMeshStateRequestCompletionML(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrWorldMeshStateRequestCompletionML.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshStateRequestCompletionML.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrWorldMeshStateRequestCompletionML.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshStateRequestCompletionML.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrWorldMeshStateRequestCompletionML.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshStateRequestCompletionML.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrWorldMeshStateRequestCompletionML.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshStateRequestCompletionML.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrWorldMeshStateRequestCompletionML.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrFutureCompletionBaseHeaderEXT.Buffer} instance to {@code XrWorldMeshStateRequestCompletionML.Buffer}. */
    public static XrWorldMeshStateRequestCompletionML.Buffer create(XrFutureCompletionBaseHeaderEXT.Buffer value) {
        return new XrWorldMeshStateRequestCompletionML.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrWorldMeshStateRequestCompletionML} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrWorldMeshStateRequestCompletionML malloc(MemoryStack stack) {
        return new XrWorldMeshStateRequestCompletionML(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrWorldMeshStateRequestCompletionML} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrWorldMeshStateRequestCompletionML calloc(MemoryStack stack) {
        return new XrWorldMeshStateRequestCompletionML(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrWorldMeshStateRequestCompletionML.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshStateRequestCompletionML.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrWorldMeshStateRequestCompletionML.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshStateRequestCompletionML.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrWorldMeshStateRequestCompletionML.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrWorldMeshStateRequestCompletionML.NEXT); }
    /** Unsafe version of {@link #futureResult}. */
    public static int nfutureResult(long struct) { return UNSAFE.getInt(null, struct + XrWorldMeshStateRequestCompletionML.FUTURERESULT); }
    /** Unsafe version of {@link #timestamp}. */
    public static long ntimestamp(long struct) { return UNSAFE.getLong(null, struct + XrWorldMeshStateRequestCompletionML.TIMESTAMP); }
    /** Unsafe version of {@link #meshBlockStateCapacityInput}. */
    public static int nmeshBlockStateCapacityInput(long struct) { return UNSAFE.getInt(null, struct + XrWorldMeshStateRequestCompletionML.MESHBLOCKSTATECAPACITYINPUT); }
    /** Unsafe version of {@link #meshBlockStateCountOutput}. */
    public static int nmeshBlockStateCountOutput(long struct) { return UNSAFE.getInt(null, struct + XrWorldMeshStateRequestCompletionML.MESHBLOCKSTATECOUNTOUTPUT); }
    /** Unsafe version of {@link #meshBlockStates}. */
    @Nullable public static XrWorldMeshBlockStateML.Buffer nmeshBlockStates(long struct) { return XrWorldMeshBlockStateML.createSafe(memGetAddress(struct + XrWorldMeshStateRequestCompletionML.MESHBLOCKSTATES), nmeshBlockStateCapacityInput(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrWorldMeshStateRequestCompletionML.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrWorldMeshStateRequestCompletionML.NEXT, value); }
    /** Unsafe version of {@link #futureResult(int) futureResult}. */
    public static void nfutureResult(long struct, int value) { UNSAFE.putInt(null, struct + XrWorldMeshStateRequestCompletionML.FUTURERESULT, value); }
    /** Unsafe version of {@link #timestamp(long) timestamp}. */
    public static void ntimestamp(long struct, long value) { UNSAFE.putLong(null, struct + XrWorldMeshStateRequestCompletionML.TIMESTAMP, value); }
    /** Sets the specified value to the {@code meshBlockStateCapacityInput} field of the specified {@code struct}. */
    public static void nmeshBlockStateCapacityInput(long struct, int value) { UNSAFE.putInt(null, struct + XrWorldMeshStateRequestCompletionML.MESHBLOCKSTATECAPACITYINPUT, value); }
    /** Unsafe version of {@link #meshBlockStateCountOutput(int) meshBlockStateCountOutput}. */
    public static void nmeshBlockStateCountOutput(long struct, int value) { UNSAFE.putInt(null, struct + XrWorldMeshStateRequestCompletionML.MESHBLOCKSTATECOUNTOUTPUT, value); }
    /** Unsafe version of {@link #meshBlockStates(XrWorldMeshBlockStateML.Buffer) meshBlockStates}. */
    public static void nmeshBlockStates(long struct, @Nullable XrWorldMeshBlockStateML.Buffer value) { memPutAddress(struct + XrWorldMeshStateRequestCompletionML.MESHBLOCKSTATES, memAddressSafe(value)); if (value != null) { nmeshBlockStateCapacityInput(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link XrWorldMeshStateRequestCompletionML} structs. */
    public static class Buffer extends StructBuffer<XrWorldMeshStateRequestCompletionML, Buffer> implements NativeResource {

        private static final XrWorldMeshStateRequestCompletionML ELEMENT_FACTORY = XrWorldMeshStateRequestCompletionML.create(-1L);

        /**
         * Creates a new {@code XrWorldMeshStateRequestCompletionML.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrWorldMeshStateRequestCompletionML#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrWorldMeshStateRequestCompletionML getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrWorldMeshStateRequestCompletionML#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrWorldMeshStateRequestCompletionML.ntype(address()); }
        /** @return the value of the {@link XrWorldMeshStateRequestCompletionML#next} field. */
        @NativeType("void *")
        public long next() { return XrWorldMeshStateRequestCompletionML.nnext(address()); }
        /** @return the value of the {@link XrWorldMeshStateRequestCompletionML#futureResult} field. */
        @NativeType("XrResult")
        public int futureResult() { return XrWorldMeshStateRequestCompletionML.nfutureResult(address()); }
        /** @return the value of the {@link XrWorldMeshStateRequestCompletionML#timestamp} field. */
        @NativeType("XrTime")
        public long timestamp() { return XrWorldMeshStateRequestCompletionML.ntimestamp(address()); }
        /** @return the value of the {@link XrWorldMeshStateRequestCompletionML#meshBlockStateCapacityInput} field. */
        @NativeType("uint32_t")
        public int meshBlockStateCapacityInput() { return XrWorldMeshStateRequestCompletionML.nmeshBlockStateCapacityInput(address()); }
        /** @return the value of the {@link XrWorldMeshStateRequestCompletionML#meshBlockStateCountOutput} field. */
        @NativeType("uint32_t")
        public int meshBlockStateCountOutput() { return XrWorldMeshStateRequestCompletionML.nmeshBlockStateCountOutput(address()); }
        /** @return a {@link XrWorldMeshBlockStateML.Buffer} view of the struct array pointed to by the {@link XrWorldMeshStateRequestCompletionML#meshBlockStates} field. */
        @Nullable
        @NativeType("XrWorldMeshBlockStateML *")
        public XrWorldMeshBlockStateML.Buffer meshBlockStates() { return XrWorldMeshStateRequestCompletionML.nmeshBlockStates(address()); }

        /** Sets the specified value to the {@link XrWorldMeshStateRequestCompletionML#type} field. */
        public XrWorldMeshStateRequestCompletionML.Buffer type(@NativeType("XrStructureType") int value) { XrWorldMeshStateRequestCompletionML.ntype(address(), value); return this; }
        /** Sets the {@link MLWorldMeshDetection#XR_TYPE_WORLD_MESH_STATE_REQUEST_COMPLETION_ML TYPE_WORLD_MESH_STATE_REQUEST_COMPLETION_ML} value to the {@link XrWorldMeshStateRequestCompletionML#type} field. */
        public XrWorldMeshStateRequestCompletionML.Buffer type$Default() { return type(MLWorldMeshDetection.XR_TYPE_WORLD_MESH_STATE_REQUEST_COMPLETION_ML); }
        /** Sets the specified value to the {@link XrWorldMeshStateRequestCompletionML#next} field. */
        public XrWorldMeshStateRequestCompletionML.Buffer next(@NativeType("void *") long value) { XrWorldMeshStateRequestCompletionML.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrWorldMeshStateRequestCompletionML#futureResult} field. */
        public XrWorldMeshStateRequestCompletionML.Buffer futureResult(@NativeType("XrResult") int value) { XrWorldMeshStateRequestCompletionML.nfutureResult(address(), value); return this; }
        /** Sets the specified value to the {@link XrWorldMeshStateRequestCompletionML#timestamp} field. */
        public XrWorldMeshStateRequestCompletionML.Buffer timestamp(@NativeType("XrTime") long value) { XrWorldMeshStateRequestCompletionML.ntimestamp(address(), value); return this; }
        /** Sets the specified value to the {@link XrWorldMeshStateRequestCompletionML#meshBlockStateCapacityInput} field. */
        public XrWorldMeshStateRequestCompletionML.Buffer meshBlockStateCapacityInput(@NativeType("uint32_t") int value) { XrWorldMeshStateRequestCompletionML.nmeshBlockStateCapacityInput(address(), value); return this; }
        /** Sets the specified value to the {@link XrWorldMeshStateRequestCompletionML#meshBlockStateCountOutput} field. */
        public XrWorldMeshStateRequestCompletionML.Buffer meshBlockStateCountOutput(@NativeType("uint32_t") int value) { XrWorldMeshStateRequestCompletionML.nmeshBlockStateCountOutput(address(), value); return this; }
        /** Sets the address of the specified {@link XrWorldMeshBlockStateML.Buffer} to the {@link XrWorldMeshStateRequestCompletionML#meshBlockStates} field. */
        public XrWorldMeshStateRequestCompletionML.Buffer meshBlockStates(@Nullable @NativeType("XrWorldMeshBlockStateML *") XrWorldMeshBlockStateML.Buffer value) { XrWorldMeshStateRequestCompletionML.nmeshBlockStates(address(), value); return this; }

    }

}