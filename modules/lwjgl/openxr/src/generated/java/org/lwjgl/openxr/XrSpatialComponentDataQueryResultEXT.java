/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct XrSpatialComponentDataQueryResultEXT {
 *     XrStructureType type;
 *     void * next;
 *     uint32_t entityIdCapacityInput;
 *     uint32_t entityIdCountOutput;
 *     XrSpatialEntityIdEXT * entityIds;
 *     uint32_t entityStateCapacityInput;
 *     uint32_t entityStateCountOutput;
 *     XrSpatialEntityTrackingStateEXT * entityStates;
 * }}</pre>
 */
public class XrSpatialComponentDataQueryResultEXT extends Struct<XrSpatialComponentDataQueryResultEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        ENTITYIDCAPACITYINPUT,
        ENTITYIDCOUNTOUTPUT,
        ENTITYIDS,
        ENTITYSTATECAPACITYINPUT,
        ENTITYSTATECOUNTOUTPUT,
        ENTITYSTATES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
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
        ENTITYIDCAPACITYINPUT = layout.offsetof(2);
        ENTITYIDCOUNTOUTPUT = layout.offsetof(3);
        ENTITYIDS = layout.offsetof(4);
        ENTITYSTATECAPACITYINPUT = layout.offsetof(5);
        ENTITYSTATECOUNTOUTPUT = layout.offsetof(6);
        ENTITYSTATES = layout.offsetof(7);
    }

    protected XrSpatialComponentDataQueryResultEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialComponentDataQueryResultEXT create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialComponentDataQueryResultEXT(address, container);
    }

    /**
     * Creates a {@code XrSpatialComponentDataQueryResultEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialComponentDataQueryResultEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** @return the value of the {@code entityIdCapacityInput} field. */
    @NativeType("uint32_t")
    public int entityIdCapacityInput() { return nentityIdCapacityInput(address()); }
    /** @return the value of the {@code entityIdCountOutput} field. */
    @NativeType("uint32_t")
    public int entityIdCountOutput() { return nentityIdCountOutput(address()); }
    /** @return a {@link LongBuffer} view of the data pointed to by the {@code entityIds} field. */
    @NativeType("XrSpatialEntityIdEXT *")
    public @Nullable LongBuffer entityIds() { return nentityIds(address()); }
    /** @return the value of the {@code entityStateCapacityInput} field. */
    @NativeType("uint32_t")
    public int entityStateCapacityInput() { return nentityStateCapacityInput(address()); }
    /** @return the value of the {@code entityStateCountOutput} field. */
    @NativeType("uint32_t")
    public int entityStateCountOutput() { return nentityStateCountOutput(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code entityStates} field. */
    @NativeType("XrSpatialEntityTrackingStateEXT *")
    public @Nullable IntBuffer entityStates() { return nentityStates(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpatialComponentDataQueryResultEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTSpatialEntity#XR_TYPE_SPATIAL_COMPONENT_DATA_QUERY_RESULT_EXT TYPE_SPATIAL_COMPONENT_DATA_QUERY_RESULT_EXT} value to the {@code type} field. */
    public XrSpatialComponentDataQueryResultEXT type$Default() { return type(EXTSpatialEntity.XR_TYPE_SPATIAL_COMPONENT_DATA_QUERY_RESULT_EXT); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpatialComponentDataQueryResultEXT next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Prepends the specified {@link XrSpatialComponentAnchorListEXT} value to the {@code next} chain. */
    public XrSpatialComponentDataQueryResultEXT next(XrSpatialComponentAnchorListEXT value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrSpatialComponentBounded2DListEXT} value to the {@code next} chain. */
    public XrSpatialComponentDataQueryResultEXT next(XrSpatialComponentBounded2DListEXT value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrSpatialComponentBounded3DListEXT} value to the {@code next} chain. */
    public XrSpatialComponentDataQueryResultEXT next(XrSpatialComponentBounded3DListEXT value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrSpatialComponentMarkerListEXT} value to the {@code next} chain. */
    public XrSpatialComponentDataQueryResultEXT next(XrSpatialComponentMarkerListEXT value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrSpatialComponentMesh2DListEXT} value to the {@code next} chain. */
    public XrSpatialComponentDataQueryResultEXT next(XrSpatialComponentMesh2DListEXT value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrSpatialComponentMesh3DListEXT} value to the {@code next} chain. */
    public XrSpatialComponentDataQueryResultEXT next(XrSpatialComponentMesh3DListEXT value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrSpatialComponentParentListEXT} value to the {@code next} chain. */
    public XrSpatialComponentDataQueryResultEXT next(XrSpatialComponentParentListEXT value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrSpatialComponentPersistenceListEXT} value to the {@code next} chain. */
    public XrSpatialComponentDataQueryResultEXT next(XrSpatialComponentPersistenceListEXT value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrSpatialComponentPlaneAlignmentListEXT} value to the {@code next} chain. */
    public XrSpatialComponentDataQueryResultEXT next(XrSpatialComponentPlaneAlignmentListEXT value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrSpatialComponentPlaneSemanticLabelListEXT} value to the {@code next} chain. */
    public XrSpatialComponentDataQueryResultEXT next(XrSpatialComponentPlaneSemanticLabelListEXT value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrSpatialComponentPolygon2DListEXT} value to the {@code next} chain. */
    public XrSpatialComponentDataQueryResultEXT next(XrSpatialComponentPolygon2DListEXT value) { return this.next(value.next(this.next()).address()); }
    /** Sets the specified value to the {@code entityIdCapacityInput} field. */
    public XrSpatialComponentDataQueryResultEXT entityIdCapacityInput(@NativeType("uint32_t") int value) { nentityIdCapacityInput(address(), value); return this; }
    /** Sets the specified value to the {@code entityIdCountOutput} field. */
    public XrSpatialComponentDataQueryResultEXT entityIdCountOutput(@NativeType("uint32_t") int value) { nentityIdCountOutput(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@code entityIds} field. */
    public XrSpatialComponentDataQueryResultEXT entityIds(@Nullable @NativeType("XrSpatialEntityIdEXT *") LongBuffer value) { nentityIds(address(), value); return this; }
    /** Sets the specified value to the {@code entityStateCapacityInput} field. */
    public XrSpatialComponentDataQueryResultEXT entityStateCapacityInput(@NativeType("uint32_t") int value) { nentityStateCapacityInput(address(), value); return this; }
    /** Sets the specified value to the {@code entityStateCountOutput} field. */
    public XrSpatialComponentDataQueryResultEXT entityStateCountOutput(@NativeType("uint32_t") int value) { nentityStateCountOutput(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code entityStates} field. */
    public XrSpatialComponentDataQueryResultEXT entityStates(@Nullable @NativeType("XrSpatialEntityTrackingStateEXT *") IntBuffer value) { nentityStates(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialComponentDataQueryResultEXT set(
        int type,
        long next,
        int entityIdCapacityInput,
        int entityIdCountOutput,
        @Nullable LongBuffer entityIds,
        int entityStateCapacityInput,
        int entityStateCountOutput,
        @Nullable IntBuffer entityStates
    ) {
        type(type);
        next(next);
        entityIdCapacityInput(entityIdCapacityInput);
        entityIdCountOutput(entityIdCountOutput);
        entityIds(entityIds);
        entityStateCapacityInput(entityStateCapacityInput);
        entityStateCountOutput(entityStateCountOutput);
        entityStates(entityStates);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialComponentDataQueryResultEXT set(XrSpatialComponentDataQueryResultEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialComponentDataQueryResultEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialComponentDataQueryResultEXT malloc() {
        return new XrSpatialComponentDataQueryResultEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialComponentDataQueryResultEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialComponentDataQueryResultEXT calloc() {
        return new XrSpatialComponentDataQueryResultEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialComponentDataQueryResultEXT} instance allocated with {@link BufferUtils}. */
    public static XrSpatialComponentDataQueryResultEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialComponentDataQueryResultEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialComponentDataQueryResultEXT} instance for the specified memory address. */
    public static XrSpatialComponentDataQueryResultEXT create(long address) {
        return new XrSpatialComponentDataQueryResultEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialComponentDataQueryResultEXT createSafe(long address) {
        return address == NULL ? null : new XrSpatialComponentDataQueryResultEXT(address, null);
    }

    /**
     * Returns a new {@link XrSpatialComponentDataQueryResultEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialComponentDataQueryResultEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialComponentDataQueryResultEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialComponentDataQueryResultEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialComponentDataQueryResultEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialComponentDataQueryResultEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialComponentDataQueryResultEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialComponentDataQueryResultEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialComponentDataQueryResultEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpatialComponentDataQueryResultEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialComponentDataQueryResultEXT malloc(MemoryStack stack) {
        return new XrSpatialComponentDataQueryResultEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialComponentDataQueryResultEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialComponentDataQueryResultEXT calloc(MemoryStack stack) {
        return new XrSpatialComponentDataQueryResultEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialComponentDataQueryResultEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialComponentDataQueryResultEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialComponentDataQueryResultEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialComponentDataQueryResultEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpatialComponentDataQueryResultEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialComponentDataQueryResultEXT.NEXT); }
    /** Unsafe version of {@link #entityIdCapacityInput}. */
    public static int nentityIdCapacityInput(long struct) { return memGetInt(struct + XrSpatialComponentDataQueryResultEXT.ENTITYIDCAPACITYINPUT); }
    /** Unsafe version of {@link #entityIdCountOutput}. */
    public static int nentityIdCountOutput(long struct) { return memGetInt(struct + XrSpatialComponentDataQueryResultEXT.ENTITYIDCOUNTOUTPUT); }
    /** Unsafe version of {@link #entityIds() entityIds}. */
    public static @Nullable LongBuffer nentityIds(long struct) { return memLongBufferSafe(memGetAddress(struct + XrSpatialComponentDataQueryResultEXT.ENTITYIDS), nentityIdCapacityInput(struct)); }
    /** Unsafe version of {@link #entityStateCapacityInput}. */
    public static int nentityStateCapacityInput(long struct) { return memGetInt(struct + XrSpatialComponentDataQueryResultEXT.ENTITYSTATECAPACITYINPUT); }
    /** Unsafe version of {@link #entityStateCountOutput}. */
    public static int nentityStateCountOutput(long struct) { return memGetInt(struct + XrSpatialComponentDataQueryResultEXT.ENTITYSTATECOUNTOUTPUT); }
    /** Unsafe version of {@link #entityStates() entityStates}. */
    public static @Nullable IntBuffer nentityStates(long struct) { return memIntBufferSafe(memGetAddress(struct + XrSpatialComponentDataQueryResultEXT.ENTITYSTATES), nentityStateCapacityInput(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpatialComponentDataQueryResultEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialComponentDataQueryResultEXT.NEXT, value); }
    /** Sets the specified value to the {@code entityIdCapacityInput} field of the specified {@code struct}. */
    public static void nentityIdCapacityInput(long struct, int value) { memPutInt(struct + XrSpatialComponentDataQueryResultEXT.ENTITYIDCAPACITYINPUT, value); }
    /** Unsafe version of {@link #entityIdCountOutput(int) entityIdCountOutput}. */
    public static void nentityIdCountOutput(long struct, int value) { memPutInt(struct + XrSpatialComponentDataQueryResultEXT.ENTITYIDCOUNTOUTPUT, value); }
    /** Unsafe version of {@link #entityIds(LongBuffer) entityIds}. */
    public static void nentityIds(long struct, @Nullable LongBuffer value) { memPutAddress(struct + XrSpatialComponentDataQueryResultEXT.ENTITYIDS, memAddressSafe(value)); if (value != null) { nentityIdCapacityInput(struct, value.remaining()); } }
    /** Sets the specified value to the {@code entityStateCapacityInput} field of the specified {@code struct}. */
    public static void nentityStateCapacityInput(long struct, int value) { memPutInt(struct + XrSpatialComponentDataQueryResultEXT.ENTITYSTATECAPACITYINPUT, value); }
    /** Unsafe version of {@link #entityStateCountOutput(int) entityStateCountOutput}. */
    public static void nentityStateCountOutput(long struct, int value) { memPutInt(struct + XrSpatialComponentDataQueryResultEXT.ENTITYSTATECOUNTOUTPUT, value); }
    /** Unsafe version of {@link #entityStates(IntBuffer) entityStates}. */
    public static void nentityStates(long struct, @Nullable IntBuffer value) { memPutAddress(struct + XrSpatialComponentDataQueryResultEXT.ENTITYSTATES, memAddressSafe(value)); if (value != null) { nentityStateCapacityInput(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link XrSpatialComponentDataQueryResultEXT} structs. */
    public static class Buffer extends StructBuffer<XrSpatialComponentDataQueryResultEXT, Buffer> implements NativeResource {

        private static final XrSpatialComponentDataQueryResultEXT ELEMENT_FACTORY = XrSpatialComponentDataQueryResultEXT.create(-1L);

        /**
         * Creates a new {@code XrSpatialComponentDataQueryResultEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialComponentDataQueryResultEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialComponentDataQueryResultEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialComponentDataQueryResultEXT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSpatialComponentDataQueryResultEXT.nnext(address()); }
        /** @return the value of the {@code entityIdCapacityInput} field. */
        @NativeType("uint32_t")
        public int entityIdCapacityInput() { return XrSpatialComponentDataQueryResultEXT.nentityIdCapacityInput(address()); }
        /** @return the value of the {@code entityIdCountOutput} field. */
        @NativeType("uint32_t")
        public int entityIdCountOutput() { return XrSpatialComponentDataQueryResultEXT.nentityIdCountOutput(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@code entityIds} field. */
        @NativeType("XrSpatialEntityIdEXT *")
        public @Nullable LongBuffer entityIds() { return XrSpatialComponentDataQueryResultEXT.nentityIds(address()); }
        /** @return the value of the {@code entityStateCapacityInput} field. */
        @NativeType("uint32_t")
        public int entityStateCapacityInput() { return XrSpatialComponentDataQueryResultEXT.nentityStateCapacityInput(address()); }
        /** @return the value of the {@code entityStateCountOutput} field. */
        @NativeType("uint32_t")
        public int entityStateCountOutput() { return XrSpatialComponentDataQueryResultEXT.nentityStateCountOutput(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code entityStates} field. */
        @NativeType("XrSpatialEntityTrackingStateEXT *")
        public @Nullable IntBuffer entityStates() { return XrSpatialComponentDataQueryResultEXT.nentityStates(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpatialComponentDataQueryResultEXT.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialComponentDataQueryResultEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTSpatialEntity#XR_TYPE_SPATIAL_COMPONENT_DATA_QUERY_RESULT_EXT TYPE_SPATIAL_COMPONENT_DATA_QUERY_RESULT_EXT} value to the {@code type} field. */
        public XrSpatialComponentDataQueryResultEXT.Buffer type$Default() { return type(EXTSpatialEntity.XR_TYPE_SPATIAL_COMPONENT_DATA_QUERY_RESULT_EXT); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpatialComponentDataQueryResultEXT.Buffer next(@NativeType("void *") long value) { XrSpatialComponentDataQueryResultEXT.nnext(address(), value); return this; }
        /** Prepends the specified {@link XrSpatialComponentAnchorListEXT} value to the {@code next} chain. */
        public XrSpatialComponentDataQueryResultEXT.Buffer next(XrSpatialComponentAnchorListEXT value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrSpatialComponentBounded2DListEXT} value to the {@code next} chain. */
        public XrSpatialComponentDataQueryResultEXT.Buffer next(XrSpatialComponentBounded2DListEXT value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrSpatialComponentBounded3DListEXT} value to the {@code next} chain. */
        public XrSpatialComponentDataQueryResultEXT.Buffer next(XrSpatialComponentBounded3DListEXT value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrSpatialComponentMarkerListEXT} value to the {@code next} chain. */
        public XrSpatialComponentDataQueryResultEXT.Buffer next(XrSpatialComponentMarkerListEXT value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrSpatialComponentMesh2DListEXT} value to the {@code next} chain. */
        public XrSpatialComponentDataQueryResultEXT.Buffer next(XrSpatialComponentMesh2DListEXT value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrSpatialComponentMesh3DListEXT} value to the {@code next} chain. */
        public XrSpatialComponentDataQueryResultEXT.Buffer next(XrSpatialComponentMesh3DListEXT value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrSpatialComponentParentListEXT} value to the {@code next} chain. */
        public XrSpatialComponentDataQueryResultEXT.Buffer next(XrSpatialComponentParentListEXT value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrSpatialComponentPersistenceListEXT} value to the {@code next} chain. */
        public XrSpatialComponentDataQueryResultEXT.Buffer next(XrSpatialComponentPersistenceListEXT value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrSpatialComponentPlaneAlignmentListEXT} value to the {@code next} chain. */
        public XrSpatialComponentDataQueryResultEXT.Buffer next(XrSpatialComponentPlaneAlignmentListEXT value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrSpatialComponentPlaneSemanticLabelListEXT} value to the {@code next} chain. */
        public XrSpatialComponentDataQueryResultEXT.Buffer next(XrSpatialComponentPlaneSemanticLabelListEXT value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrSpatialComponentPolygon2DListEXT} value to the {@code next} chain. */
        public XrSpatialComponentDataQueryResultEXT.Buffer next(XrSpatialComponentPolygon2DListEXT value) { return this.next(value.next(this.next()).address()); }
        /** Sets the specified value to the {@code entityIdCapacityInput} field. */
        public XrSpatialComponentDataQueryResultEXT.Buffer entityIdCapacityInput(@NativeType("uint32_t") int value) { XrSpatialComponentDataQueryResultEXT.nentityIdCapacityInput(address(), value); return this; }
        /** Sets the specified value to the {@code entityIdCountOutput} field. */
        public XrSpatialComponentDataQueryResultEXT.Buffer entityIdCountOutput(@NativeType("uint32_t") int value) { XrSpatialComponentDataQueryResultEXT.nentityIdCountOutput(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@code entityIds} field. */
        public XrSpatialComponentDataQueryResultEXT.Buffer entityIds(@Nullable @NativeType("XrSpatialEntityIdEXT *") LongBuffer value) { XrSpatialComponentDataQueryResultEXT.nentityIds(address(), value); return this; }
        /** Sets the specified value to the {@code entityStateCapacityInput} field. */
        public XrSpatialComponentDataQueryResultEXT.Buffer entityStateCapacityInput(@NativeType("uint32_t") int value) { XrSpatialComponentDataQueryResultEXT.nentityStateCapacityInput(address(), value); return this; }
        /** Sets the specified value to the {@code entityStateCountOutput} field. */
        public XrSpatialComponentDataQueryResultEXT.Buffer entityStateCountOutput(@NativeType("uint32_t") int value) { XrSpatialComponentDataQueryResultEXT.nentityStateCountOutput(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code entityStates} field. */
        public XrSpatialComponentDataQueryResultEXT.Buffer entityStates(@Nullable @NativeType("XrSpatialEntityTrackingStateEXT *") IntBuffer value) { XrSpatialComponentDataQueryResultEXT.nentityStates(address(), value); return this; }

    }

}