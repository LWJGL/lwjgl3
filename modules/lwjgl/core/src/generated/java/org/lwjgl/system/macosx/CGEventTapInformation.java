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
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code tapPoint} &ndash; HID, session, annotated session</li>
 * <li>{@code options} &ndash; listener, filter</li>
 * <li>{@code eventsOfInterest} &ndash; mask of events being tapped</li>
 * <li>{@code tappingProcess} &ndash; process that is tapping events</li>
 * <li>{@code processBeingTapped} &ndash; zero if not a per-process tap</li>
 * <li>{@code enabled} &ndash; true if tap is enabled</li>
 * <li>{@code minUsecLatency} &ndash; minimum latency in microseconds</li>
 * <li>{@code avgUsecLatency} &ndash; average latency in microseconds</li>
 * <li>{@code maxUsecLatency} &ndash; maximum latency in microseconds</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CGEventTapInformation {
 *     uint32_t eventTapID;
 *     CGEventTapLocation tapPoint;
 *     CGEventTapOptions options;
 *     CGEventMask eventsOfInterest;
 *     pid_t tappingProcess;
 *     pid_t processBeingTapped;
 *     bool enabled;
 *     float minUsecLatency;
 *     float avgUsecLatency;
 *     float maxUsecLatency;
 * }</code></pre>
 */
public class CGEventTapInformation extends Struct implements NativeResource {

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

    /** Returns the value of the {@code eventTapID} field. */
    @NativeType("uint32_t")
    public int eventTapID() { return neventTapID(address()); }
    /** Returns the value of the {@code tapPoint} field. */
    @NativeType("CGEventTapLocation")
    public int tapPoint() { return ntapPoint(address()); }
    /** Returns the value of the {@code options} field. */
    @NativeType("CGEventTapOptions")
    public int options() { return noptions(address()); }
    /** Returns the value of the {@code eventsOfInterest} field. */
    @NativeType("CGEventMask")
    public long eventsOfInterest() { return neventsOfInterest(address()); }
    /** Returns the value of the {@code tappingProcess} field. */
    @NativeType("pid_t")
    public long tappingProcess() { return ntappingProcess(address()); }
    /** Returns the value of the {@code processBeingTapped} field. */
    @NativeType("pid_t")
    public long processBeingTapped() { return nprocessBeingTapped(address()); }
    /** Returns the value of the {@code enabled} field. */
    @NativeType("bool")
    public boolean enabled() { return nenabled(address()); }
    /** Returns the value of the {@code minUsecLatency} field. */
    public float minUsecLatency() { return nminUsecLatency(address()); }
    /** Returns the value of the {@code avgUsecLatency} field. */
    public float avgUsecLatency() { return navgUsecLatency(address()); }
    /** Returns the value of the {@code maxUsecLatency} field. */
    public float maxUsecLatency() { return nmaxUsecLatency(address()); }

    // -----------------------------------

    /** Returns a new {@code CGEventTapInformation} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CGEventTapInformation malloc() {
        return wrap(CGEventTapInformation.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code CGEventTapInformation} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CGEventTapInformation calloc() {
        return wrap(CGEventTapInformation.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code CGEventTapInformation} instance allocated with {@link BufferUtils}. */
    public static CGEventTapInformation create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(CGEventTapInformation.class, memAddress(container), container);
    }

    /** Returns a new {@code CGEventTapInformation} instance for the specified memory address. */
    public static CGEventTapInformation create(long address) {
        return wrap(CGEventTapInformation.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CGEventTapInformation createSafe(long address) {
        return address == NULL ? null : wrap(CGEventTapInformation.class, address);
    }

    /**
     * Returns a new {@link CGEventTapInformation.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CGEventTapInformation.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CGEventTapInformation.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CGEventTapInformation.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CGEventTapInformation.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CGEventTapInformation.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link CGEventTapInformation.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CGEventTapInformation.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CGEventTapInformation.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code CGEventTapInformation} instance allocated on the thread-local {@link MemoryStack}. */
    public static CGEventTapInformation mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code CGEventTapInformation} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static CGEventTapInformation callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code CGEventTapInformation} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CGEventTapInformation mallocStack(MemoryStack stack) {
        return wrap(CGEventTapInformation.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code CGEventTapInformation} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CGEventTapInformation callocStack(MemoryStack stack) {
        return wrap(CGEventTapInformation.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link CGEventTapInformation.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static CGEventTapInformation.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link CGEventTapInformation.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static CGEventTapInformation.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link CGEventTapInformation.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CGEventTapInformation.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CGEventTapInformation.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CGEventTapInformation.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
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
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CGEventTapInformation#SIZEOF}, and its mark will be undefined.
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

        /** Returns the value of the {@code eventTapID} field. */
        @NativeType("uint32_t")
        public int eventTapID() { return CGEventTapInformation.neventTapID(address()); }
        /** Returns the value of the {@code tapPoint} field. */
        @NativeType("CGEventTapLocation")
        public int tapPoint() { return CGEventTapInformation.ntapPoint(address()); }
        /** Returns the value of the {@code options} field. */
        @NativeType("CGEventTapOptions")
        public int options() { return CGEventTapInformation.noptions(address()); }
        /** Returns the value of the {@code eventsOfInterest} field. */
        @NativeType("CGEventMask")
        public long eventsOfInterest() { return CGEventTapInformation.neventsOfInterest(address()); }
        /** Returns the value of the {@code tappingProcess} field. */
        @NativeType("pid_t")
        public long tappingProcess() { return CGEventTapInformation.ntappingProcess(address()); }
        /** Returns the value of the {@code processBeingTapped} field. */
        @NativeType("pid_t")
        public long processBeingTapped() { return CGEventTapInformation.nprocessBeingTapped(address()); }
        /** Returns the value of the {@code enabled} field. */
        @NativeType("bool")
        public boolean enabled() { return CGEventTapInformation.nenabled(address()); }
        /** Returns the value of the {@code minUsecLatency} field. */
        public float minUsecLatency() { return CGEventTapInformation.nminUsecLatency(address()); }
        /** Returns the value of the {@code avgUsecLatency} field. */
        public float avgUsecLatency() { return CGEventTapInformation.navgUsecLatency(address()); }
        /** Returns the value of the {@code maxUsecLatency} field. */
        public float maxUsecLatency() { return CGEventTapInformation.nmaxUsecLatency(address()); }

    }

}