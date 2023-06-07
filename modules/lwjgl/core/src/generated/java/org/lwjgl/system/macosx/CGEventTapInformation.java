/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.macosx;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * The structure used to report information about event taps.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CGEventTapInformation {
 *     uint32_t eventTapID;
 *     CGEventTapLocation {@link #tapPoint};
 *     CGEventTapOptions {@link #options};
 *     CGEventMask {@link #eventsOfInterest};
 *     pid_t {@link #tappingProcess};
 *     pid_t {@link #processBeingTapped};
 *     bool {@link #enabled};
 *     float {@link #minUsecLatency};
 *     float {@link #avgUsecLatency};
 *     float {@link #maxUsecLatency};
 * }</code></pre>
 */
public class CGEventTapInformation extends Struct<CGEventTapInformation> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        EVENTTAPID,
        TAPPOINT,
        OPTIONS,
        EVENTSOFINTEREST,
        TAPPINGPROCESS,
        PROCESSBEINGTAPPED,
        ENABLED,
        MINUSECLATENCY,
        AVGUSECLATENCY,
        MAXUSECLATENCY;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(8),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(1),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        EVENTTAPID = layout.offsetof(0);
        TAPPOINT = layout.offsetof(1);
        OPTIONS = layout.offsetof(2);
        EVENTSOFINTEREST = layout.offsetof(3);
        TAPPINGPROCESS = layout.offsetof(4);
        PROCESSBEINGTAPPED = layout.offsetof(5);
        ENABLED = layout.offsetof(6);
        MINUSECLATENCY = layout.offsetof(7);
        AVGUSECLATENCY = layout.offsetof(8);
        MAXUSECLATENCY = layout.offsetof(9);
    }

    protected CGEventTapInformation(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected CGEventTapInformation create(long address, @Nullable ByteBuffer container) {
        return new CGEventTapInformation(address, container);
    }

    /**
     * Creates a {@code CGEventTapInformation} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CGEventTapInformation(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code eventTapID} field. */
    @NativeType("uint32_t")
    public int eventTapID() { return neventTapID(address()); }
    /** HID, session, annotated session */
    @NativeType("CGEventTapLocation")
    public int tapPoint() { return ntapPoint(address()); }
    /** listener, filter */
    @NativeType("CGEventTapOptions")
    public int options() { return noptions(address()); }
    /** mask of events being tapped */
    @NativeType("CGEventMask")
    public long eventsOfInterest() { return neventsOfInterest(address()); }
    /** process that is tapping events */
    @NativeType("pid_t")
    public long tappingProcess() { return ntappingProcess(address()); }
    /** zero if not a per-process tap */
    @NativeType("pid_t")
    public long processBeingTapped() { return nprocessBeingTapped(address()); }
    /** true if tap is enabled */
    @NativeType("bool")
    public boolean enabled() { return nenabled(address()); }
    /** minimum latency in microseconds */
    public float minUsecLatency() { return nminUsecLatency(address()); }
    /** average latency in microseconds */
    public float avgUsecLatency() { return navgUsecLatency(address()); }
    /** maximum latency in microseconds */
    public float maxUsecLatency() { return nmaxUsecLatency(address()); }

    // -----------------------------------

    /** Returns a new {@code CGEventTapInformation} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CGEventTapInformation malloc() {
        return new CGEventTapInformation(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code CGEventTapInformation} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CGEventTapInformation calloc() {
        return new CGEventTapInformation(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code CGEventTapInformation} instance allocated with {@link BufferUtils}. */
    public static CGEventTapInformation create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new CGEventTapInformation(memAddress(container), container);
    }

    /** Returns a new {@code CGEventTapInformation} instance for the specified memory address. */
    public static CGEventTapInformation create(long address) {
        return new CGEventTapInformation(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CGEventTapInformation createSafe(long address) {
        return address == NULL ? null : new CGEventTapInformation(address, null);
    }

    /**
     * Returns a new {@link CGEventTapInformation.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CGEventTapInformation.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CGEventTapInformation.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CGEventTapInformation.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CGEventTapInformation.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CGEventTapInformation.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link CGEventTapInformation.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CGEventTapInformation.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CGEventTapInformation.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static CGEventTapInformation mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static CGEventTapInformation callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static CGEventTapInformation mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static CGEventTapInformation callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static CGEventTapInformation.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static CGEventTapInformation.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static CGEventTapInformation.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static CGEventTapInformation.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code CGEventTapInformation} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CGEventTapInformation malloc(MemoryStack stack) {
        return new CGEventTapInformation(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code CGEventTapInformation} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CGEventTapInformation calloc(MemoryStack stack) {
        return new CGEventTapInformation(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link CGEventTapInformation.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CGEventTapInformation.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CGEventTapInformation.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CGEventTapInformation.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #eventTapID}. */
    public static int neventTapID(long struct) { return UNSAFE.getInt(null, struct + CGEventTapInformation.EVENTTAPID); }
    /** Unsafe version of {@link #tapPoint}. */
    public static int ntapPoint(long struct) { return UNSAFE.getInt(null, struct + CGEventTapInformation.TAPPOINT); }
    /** Unsafe version of {@link #options}. */
    public static int noptions(long struct) { return UNSAFE.getInt(null, struct + CGEventTapInformation.OPTIONS); }
    /** Unsafe version of {@link #eventsOfInterest}. */
    public static long neventsOfInterest(long struct) { return UNSAFE.getLong(null, struct + CGEventTapInformation.EVENTSOFINTEREST); }
    /** Unsafe version of {@link #tappingProcess}. */
    public static long ntappingProcess(long struct) { return memGetAddress(struct + CGEventTapInformation.TAPPINGPROCESS); }
    /** Unsafe version of {@link #processBeingTapped}. */
    public static long nprocessBeingTapped(long struct) { return memGetAddress(struct + CGEventTapInformation.PROCESSBEINGTAPPED); }
    /** Unsafe version of {@link #enabled}. */
    public static boolean nenabled(long struct) { return UNSAFE.getByte(null, struct + CGEventTapInformation.ENABLED) != 0; }
    /** Unsafe version of {@link #minUsecLatency}. */
    public static float nminUsecLatency(long struct) { return UNSAFE.getFloat(null, struct + CGEventTapInformation.MINUSECLATENCY); }
    /** Unsafe version of {@link #avgUsecLatency}. */
    public static float navgUsecLatency(long struct) { return UNSAFE.getFloat(null, struct + CGEventTapInformation.AVGUSECLATENCY); }
    /** Unsafe version of {@link #maxUsecLatency}. */
    public static float nmaxUsecLatency(long struct) { return UNSAFE.getFloat(null, struct + CGEventTapInformation.MAXUSECLATENCY); }

    // -----------------------------------

    /** An array of {@link CGEventTapInformation} structs. */
    public static class Buffer extends StructBuffer<CGEventTapInformation, Buffer> implements NativeResource {

        private static final CGEventTapInformation ELEMENT_FACTORY = CGEventTapInformation.create(-1L);

        /**
         * Creates a new {@code CGEventTapInformation.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CGEventTapInformation#SIZEOF}, and its mark will be undefined.</p>
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
        protected CGEventTapInformation getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code eventTapID} field. */
        @NativeType("uint32_t")
        public int eventTapID() { return CGEventTapInformation.neventTapID(address()); }
        /** @return the value of the {@link CGEventTapInformation#tapPoint} field. */
        @NativeType("CGEventTapLocation")
        public int tapPoint() { return CGEventTapInformation.ntapPoint(address()); }
        /** @return the value of the {@link CGEventTapInformation#options} field. */
        @NativeType("CGEventTapOptions")
        public int options() { return CGEventTapInformation.noptions(address()); }
        /** @return the value of the {@link CGEventTapInformation#eventsOfInterest} field. */
        @NativeType("CGEventMask")
        public long eventsOfInterest() { return CGEventTapInformation.neventsOfInterest(address()); }
        /** @return the value of the {@link CGEventTapInformation#tappingProcess} field. */
        @NativeType("pid_t")
        public long tappingProcess() { return CGEventTapInformation.ntappingProcess(address()); }
        /** @return the value of the {@link CGEventTapInformation#processBeingTapped} field. */
        @NativeType("pid_t")
        public long processBeingTapped() { return CGEventTapInformation.nprocessBeingTapped(address()); }
        /** @return the value of the {@link CGEventTapInformation#enabled} field. */
        @NativeType("bool")
        public boolean enabled() { return CGEventTapInformation.nenabled(address()); }
        /** @return the value of the {@link CGEventTapInformation#minUsecLatency} field. */
        public float minUsecLatency() { return CGEventTapInformation.nminUsecLatency(address()); }
        /** @return the value of the {@link CGEventTapInformation#avgUsecLatency} field. */
        public float avgUsecLatency() { return CGEventTapInformation.navgUsecLatency(address()); }
        /** @return the value of the {@link CGEventTapInformation#maxUsecLatency} field. */
        public float maxUsecLatency() { return CGEventTapInformation.nmaxUsecLatency(address()); }

    }

}