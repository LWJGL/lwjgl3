/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import org.lwjgl.*;

import java.nio.*;
import java.util.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MathUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.Pointer.*;
import static org.lwjgl.system.StackWalkUtil.*;

/**
 * An off-heap memory stack.
 *
 * <p>This class should be used in a thread-local manner for stack allocations.</p>
 *
 * @see Configuration#STACK_SIZE
 * @see Configuration#DEBUG_STACK
 */
public class MemoryStack implements AutoCloseable {

    private static final int DEFAULT_STACK_SIZE   = Configuration.STACK_SIZE.get(64) * 1024;
    private static final int DEFAULT_STACK_FRAMES = 8;

    private static final boolean DEBUG_STACK = Configuration.DEBUG_STACK.get(false);

    private static final ThreadLocal<MemoryStack> TLS = ThreadLocal.withInitial(MemoryStack::create);

    static {
        if (DEFAULT_STACK_SIZE < 0) {
            throw new IllegalStateException("Invalid stack size.");
        }
    }

    @SuppressWarnings("FieldCanBeLocal")
    private final ByteBuffer buffer;
    private final long       address;

    private final int size;

    private int pointer;

    private   int[] frames;
    protected int   frameIndex;

    /**
     * Creates a new {@link MemoryStack} with the specified size.
     *
     * @param size the maximum number of bytes that may be allocated on the stack
     */
    protected MemoryStack(int size) {
        this.buffer = BufferUtils.createByteBuffer(size);
        this.address = memAddress(buffer);

        this.size = size;
        this.pointer = size;

        this.frames = new int[DEFAULT_STACK_FRAMES];
    }

    /** Creates a new {@link MemoryStack} with the default size. */
    public static MemoryStack create() {
        return create(DEFAULT_STACK_SIZE);
    }

    /**
     * Creates a new {@link MemoryStack} with the specified size.
     *
     * @param size the maximum number of bytes that may be allocated on the stack
     */
    public static MemoryStack create(int size) {
        return DEBUG_STACK
            ? new DebugMemoryStack(size)
            : new MemoryStack(size);
    }

    /**
     * Stores the current stack pointer and pushes a new frame to the stack.
     *
     * <p>This method should be called when entering a method, before doing any stack allocations. When exiting a method, call the {@link #pop} method to
     * restore the previous stack frame.</p>
     *
     * <p>Pairs of push/pop calls may be nested. Care must be taken to:</p>
     * <ul>
     * <li>match every push with a pop</li>
     * <li>not call pop before push has been called at least once</li>
     * <li>not nest push calls to more than the maximum supported depth</li>
     * </ul>
     *
     * @return this stack
     */
    public MemoryStack push() {
        if (frameIndex == frames.length) {
            frameOverflow();
        }

        frames[frameIndex++] = pointer;
        return this;
    }

    private void frameOverflow() {
        if (DEBUG) {
            apiLog("[WARNING] Out of frame stack space (" + frames.length + ") in thread: " + Thread.currentThread());
        }
        frames = Arrays.copyOf(frames, frames.length * 3 / 2);
    }

    /**
     * Pops the current stack frame and moves the stack pointer to the end of the previous stack frame.
     *
     * @return this stack
     */
    public MemoryStack pop() {
        pointer = frames[--frameIndex];
        return this;
    }

    /**
     * Calls {@link #pop} on this {@link MemoryStack}.
     *
     * <p>This method should not be used directly. It is called automatically when the {@code MemoryStack} is used as a resource in a try-with-resources
     * statement.</p>
     */
    @Override
    public void close() {
        //noinspection resource
        pop();
    }

    /** Stores the method that pushed a frame and checks if it is the same method when the frame is popped. */
    private static class DebugMemoryStack extends MemoryStack {

        private Object[] debugFrames;

        DebugMemoryStack(int size) {
            super(size);
            debugFrames = new Object[DEFAULT_STACK_FRAMES];
        }

        @Override
        public MemoryStack push() {
            if (frameIndex == debugFrames.length) {
                frameOverflow();
            }

            debugFrames[frameIndex] = stackWalkGetMethod(2, MemoryStack.class);

            return super.push();
        }

        private void frameOverflow() {
            debugFrames = Arrays.copyOf(debugFrames, debugFrames.length * 3 / 2);
        }

        @Override
        public MemoryStack pop() {
            checkPop(
                stackWalkGetMethod(2, MemoryStack.class),
                debugFrames[frameIndex - 1]
            );
            debugFrames[frameIndex - 1] = null;

            return super.pop();
        }

        private static void checkPop(Object popped, Object pushed) {
            if (!stackWalkIsSameMethod(popped, pushed))
            //noinspection resource
            {
                DEBUG_STREAM.format(
                    "[LWJGL] Asymmetric pop detected:\n\tPUSHED: %s\n\tPOPPED: %s\n\tTHREAD: %s\n",
                    pushed.toString(),
                    popped.toString(),
                    Thread.currentThread()
                );
            }
        }

    }

    /**
     * Returns the address of the backing off-heap memory.
     *
     * <p>The stack grows "downwards", so the bottom of the stack is at {@code address + size}, while the top is at {@code address}.</p>
     */
    public long getAddress() {
        return address;
    }

    /**
     * Returns the size of the backing off-heap memory.
     *
     * <p>This is the maximum number of bytes that may be allocated on the stack.</p>
     */
    public int getSize() {
        return size;
    }

    /**
     * Returns the current frame index.
     *
     * <p>This is the current number of nested {@link #push} calls.</p>
     */
    public int getFrameIndex() {
        return frameIndex;
    }

    /**
     * Returns the current stack pointer.
     *
     * <p>The stack grows "downwards", so when the stack is empty {@code pointer} is equal to {@code size}. On every allocation {@code pointer} is reduced by
     * the allocated size (after alignment) and {@code address + pointers} points to the last byte of the last allocation.</p>
     *
     * <p>Effectively, this methods returns how many more bytes may be allocated on the stack.</p>
     */
    public int getPointer() {
        return pointer;
    }

    /**
     * Sets the current stack pointer.
     *
     * <p>This method directly manipulates the stack pointer. Using it irresponsibly may break the internal state of the stack. It should only be used in rare
     * cases or in auto-generated code.</p>
     */
    public void setPointer(int pointer) {
        if (CHECKS) {
            checkPointer(pointer);
        }

        this.pointer = pointer;
    }

    private void checkPointer(int pointer) {
        if (pointer < 0 || size < pointer) {
            throw new IndexOutOfBoundsException("Invalid stack pointer");
        }
    }

    private static void checkAlignment(int alignment) {
        if (!mathIsPoT(alignment)) {
            throw new IllegalArgumentException("Alignment must be a power-of-two value.");
        }
    }

    private static void checkPush(int pointer) {
        if (pointer < 0) {
            throw new OutOfMemoryError("Out of stack space.");
        }
    }

    /**
     * Calls {@link #nmalloc(int, int)} with {@code alignment} equal to 1.
     *
     * @param size the allocation size
     *
     * @return the memory address on the stack for the requested allocation
     */
    public long nmalloc(int size) {
        return nmalloc(1, size);
    }

    /**
     * Allocates a block of {@code size} bytes of memory on the stack. The content of the newly allocated block of memory is not initialized, remaining with
     * indeterminate values.
     *
     * @param alignment the required alignment
     * @param size      the allocation size
     *
     * @return the memory address on the stack for the requested allocation
     */
    public long nmalloc(int alignment, int size) {
        int newPointer = pointer - size;

        if (DEBUG) {
            checkAlignment(alignment);
        }
        if (CHECKS) {
            checkPush(newPointer);
        }

        // Align pointer to the specified alignment
        newPointer &= ~(alignment - 1);

        pointer = newPointer;

        return this.address + newPointer;
    }

    /**
     * Allocates a block of memory on the stack for an array of {@code num} elements, each of them {@code size} bytes long, and initializes all its bits to
     * zero.
     *
     * @param alignment the required element alignment
     * @param num       num  the number of elements to allocate
     * @param size      the size of each element
     *
     * @return the memory address on the stack for the requested allocation
     */
    public long ncalloc(int alignment, int num, int size) {
        int  bytes   = num * size;
        long address = nmalloc(alignment, bytes);
        memSet(address, 0, bytes);
        return address;
    }

    // -------------------------------------------------

    /**
     * Allocates an aligned {@link ByteBuffer} on the stack.
     *
     * @param alignment the required buffer alignment
     * @param size      the number of elements in the buffer
     *
     * @return the allocated buffer
     */
    public ByteBuffer malloc(int alignment, int size) { return memByteBuffer(nmalloc(alignment, size), size); }
    /** Calloc version of {@link #malloc(int, int)}. */
    public ByteBuffer calloc(int alignment, int size) { return memByteBuffer(ncalloc(alignment, size, 1), size); }

    /**
     * Allocates a {@link ByteBuffer} on the stack.
     *
     * @param size the number of elements in the buffer
     *
     * @return the allocated buffer
     */
    public ByteBuffer malloc(int size) { return malloc(1, size); }
    /** Calloc version of {@link #malloc(int)}. */
    public ByteBuffer calloc(int size) { return calloc(1, size); }

    /** Single value version of {@link #malloc}. */
    public ByteBuffer bytes(byte x) {
        return malloc(1).put(0, x);
    }

    /** Two value version of {@link #malloc}. */
    public ByteBuffer bytes(byte x, byte y) {
        return malloc(2).put(0, x).put(1, y);
    }

    /** Three value version of {@link #malloc}. */
    public ByteBuffer bytes(byte x, byte y, byte z) {
        return malloc(3).put(0, x).put(1, y).put(2, z);
    }

    /** Four value version of {@link #malloc}. */
    public ByteBuffer bytes(byte x, byte y, byte z, byte w) {
        return malloc(4).put(0, x).put(1, y).put(2, z).put(3, w);
    }

    /** Vararg version of {@link #malloc}. */
    public ByteBuffer bytes(byte... values) {
        ByteBuffer buffer = malloc(values.length).put(values);
        buffer.flip();
        return buffer;
    }

    // -------------------------------------------------

    /** Short version of {@link #malloc(int)}. */
    public ShortBuffer mallocShort(int size) { return memShortBuffer(nmalloc(2, size << 1), size); }
    /** Short version of {@link #calloc(int)}. */
    public ShortBuffer callocShort(int size) { return memShortBuffer(ncalloc(2, size, 2), size); }

    /** Single value version of {@link #mallocShort}. */
    public ShortBuffer shorts(short x) { return mallocShort(1).put(0, x); }
    /** Two value version of {@link #mallocShort}. */
    public ShortBuffer shorts(short x, short y) { return mallocShort(2).put(0, x).put(1, y); }
    /** Three value version of {@link #mallocShort}. */
    public ShortBuffer shorts(short x, short y, short z) { return mallocShort(3).put(0, x).put(1, y).put(2, z); }
    /** Four value version of {@link #mallocShort}. */
    public ShortBuffer shorts(short x, short y, short z, short w) { return mallocShort(4).put(0, x).put(1, y).put(2, z).put(3, w); }

    /** Vararg version of {@link #mallocShort}. */
    public ShortBuffer shorts(short... values) {
        ShortBuffer buffer = mallocShort(values.length).put(values);
        buffer.flip();
        return buffer;
    }

    // -------------------------------------------------

    /** Int version of {@link #malloc(int)}. */
    public IntBuffer mallocInt(int size) { return memIntBuffer(nmalloc(4, size << 2), size); }
    /** Int version of {@link #calloc(int)}. */
    public IntBuffer callocInt(int size) { return memIntBuffer(ncalloc(4, size, 4), size); }

    /** Single value version of {@link #mallocInt}. */
    public IntBuffer ints(int x) { return mallocInt(1).put(0, x); }
    /** Two value version of {@link #mallocInt}. */
    public IntBuffer ints(int x, int y) { return mallocInt(2).put(0, x).put(1, y); }
    /** Three value version of {@link #mallocInt}. */
    public IntBuffer ints(int x, int y, int z) { return mallocInt(3).put(0, x).put(1, y).put(2, z); }
    /** Four value version of {@link #mallocInt}. */
    public IntBuffer ints(int x, int y, int z, int w) { return mallocInt(4).put(0, x).put(1, y).put(2, z).put(3, w); }

    /** Vararg version of {@link #mallocInt}. */
    public IntBuffer ints(int... values) {
        IntBuffer buffer = mallocInt(values.length).put(values);
        buffer.flip();
        return buffer;
    }

    // -------------------------------------------------

    /** Long version of {@link #malloc(int)}. */
    public LongBuffer mallocLong(int size) { return memLongBuffer(nmalloc(8, size << 3), size); }
    /** Long version of {@link #calloc(int)}. */
    public LongBuffer callocLong(int size) { return memLongBuffer(ncalloc(8, size, 8), size); }

    /** Single value version of {@link #mallocLong}. */
    public LongBuffer longs(long x) { return mallocLong(1).put(0, x); }
    /** Two value version of {@link #mallocLong}. */
    public LongBuffer longs(long x, long y) { return mallocLong(2).put(0, x).put(1, y); }
    /** Three value version of {@link #mallocLong}. */
    public LongBuffer longs(long x, long y, long z) { return mallocLong(3).put(0, x).put(1, y).put(2, z); }
    /** Four value version of {@link #mallocLong}. */
    public LongBuffer longs(long x, long y, long z, long w) { return mallocLong(4).put(0, x).put(1, y).put(2, z).put(3, w); }

    /** Vararg version of {@link #mallocLong}. */
    public LongBuffer longs(long... more) {
        LongBuffer buffer = mallocLong(more.length).put(more);
        buffer.flip();
        return buffer;
    }

    // -------------------------------------------------

    /** Float version of {@link #malloc(int)}. */
    public FloatBuffer mallocFloat(int size) { return memFloatBuffer(nmalloc(4, size << 2), size); }
    /** Float version of {@link #calloc(int)}. */
    public FloatBuffer callocFloat(int size) { return memFloatBuffer(ncalloc(4, size, 4), size); }

    /** Single value version of {@link #mallocFloat}. */
    public FloatBuffer floats(float x) { return mallocFloat(1).put(0, x); }
    /** Two value version of {@link #mallocFloat}. */
    public FloatBuffer floats(float x, float y) { return mallocFloat(2).put(0, x).put(1, y); }
    /** Three value version of {@link #mallocFloat}. */
    public FloatBuffer floats(float x, float y, float z) { return mallocFloat(3).put(0, x).put(1, y).put(2, z); }
    /** Four value version of {@link #mallocFloat}. */
    public FloatBuffer floats(float x, float y, float z, float w) { return mallocFloat(4).put(0, x).put(1, y).put(2, z).put(3, w); }

    /** Vararg version of {@link #mallocFloat}. */
    public FloatBuffer floats(float... values) {
        FloatBuffer buffer = mallocFloat(values.length).put(values);
        buffer.flip();
        return buffer;
    }

    // -------------------------------------------------

    /** Double version of {@link #malloc(int)}. */
    public DoubleBuffer mallocDouble(int size) { return memDoubleBuffer(nmalloc(8, size << 3), size); }
    /** Double version of {@link #calloc(int)}. */
    public DoubleBuffer callocDouble(int size) { return memDoubleBuffer(ncalloc(8, size, 8), size); }

    /** Single value version of {@link #mallocDouble}. */
    public DoubleBuffer doubles(double x) { return mallocDouble(1).put(0, x); }
    /** Two value version of {@link #mallocDouble}. */
    public DoubleBuffer doubles(double x, double y) { return mallocDouble(2).put(0, x).put(1, y); }
    /** Three value version of {@link #mallocDouble}. */
    public DoubleBuffer doubles(double x, double y, double z) { return mallocDouble(3).put(0, x).put(1, y).put(2, z); }
    /** Four value version of {@link #mallocDouble}. */
    public DoubleBuffer doubles(double x, double y, double z, double w) { return mallocDouble(4).put(0, x).put(1, y).put(2, z).put(3, w); }

    /** Vararg version of {@link #mallocDouble}. */
    public DoubleBuffer doubles(double... values) {
        DoubleBuffer buffer = mallocDouble(values.length).put(values);
        buffer.flip();
        return buffer;
    }

    // -------------------------------------------------

    /** Pointer version of {@link #malloc(int)}. */
    public PointerBuffer mallocPointer(int size) { return memPointerBuffer(nmalloc(POINTER_SIZE, size << POINTER_SHIFT), size); }
    /** Pointer version of {@link #calloc(int)}. */
    public PointerBuffer callocPointer(int size) { return memPointerBuffer(ncalloc(POINTER_SIZE, size, POINTER_SIZE), size); }

    /** Single value version of {@link #mallocPointer}. */
    public PointerBuffer pointers(long x) { return mallocPointer(1).put(0, x); }
    /** Two value version of {@link #mallocPointer}. */
    public PointerBuffer pointers(long x, long y) { return mallocPointer(2).put(0, x).put(1, y); }
    /** Three value version of {@link #mallocPointer}. */
    public PointerBuffer pointers(long x, long y, long z) { return mallocPointer(3).put(0, x).put(1, y).put(2, z); }
    /** Four value version of {@link #mallocPointer}. */
    public PointerBuffer pointers(long x, long y, long z, long w) { return mallocPointer(4).put(0, x).put(1, y).put(2, z).put(3, w); }

    /** Vararg version of {@link #mallocPointer}. */
    public PointerBuffer pointers(long... values) {
        PointerBuffer buffer = mallocPointer(values.length).put(values);
        buffer.flip();
        return buffer;
    }

    /** Single value version of {@link #mallocPointer}. */
    public PointerBuffer pointers(Pointer x) { return mallocPointer(1).put(0, x); }
    /** Two value version of {@link #mallocPointer}. */
    public PointerBuffer pointers(Pointer x, Pointer y) { return mallocPointer(2).put(0, x).put(1, y); }
    /** Three value version of {@link #mallocPointer}. */
    public PointerBuffer pointers(Pointer x, Pointer y, Pointer z) { return mallocPointer(3).put(0, x).put(1, y).put(2, z); }
    /** Four value version of {@link #mallocPointer}. */
    public PointerBuffer pointers(Pointer x, Pointer y, Pointer z, Pointer w) { return mallocPointer(4).put(0, x).put(1, y).put(2, z).put(3, w); }

    /** Vararg version of {@link #mallocPointer}. */
    public PointerBuffer pointers(Pointer... values) {
        PointerBuffer buffer = mallocPointer(values.length);
        for (int i = 0; i < values.length; i++) {
            buffer.put(i, values[i]);
        }
        return buffer;
    }

    // -------------------------------------------------

    /**
     * Encodes the specified text on the stack using ASCII encoding and returns a ByteBuffer that points to the encoded text, including a null-terminator.
     *
     * @param text the text to encode. If {@code text} is null, null is returned.
     */
    public ByteBuffer ASCII(CharSequence text) {
        return ASCII(text, true);
    }

    /**
     * Encodes the specified text on the stack using ASCII encoding and returns a ByteBuffer that points to the encoded text.
     *
     * @param text           the text to encode. If {@code text} is null, null is returned.
     * @param nullTerminated if true, a null-terminator is included at the end of the encoded text
     */
    public ByteBuffer ASCII(CharSequence text, boolean nullTerminated) {
        if (text == null) {
            return null;
        }

        ByteBuffer encoded = malloc(memLengthASCII(text, nullTerminated));
        memASCII(text, nullTerminated, encoded);
        return encoded;
    }

    /**
     * Encodes the specified text on the stack using UTF8 encoding and returns a ByteBuffer that points to the encoded text, including a null-terminator.
     *
     * @param text the text to encode. If {@code text} is null, null is returned.
     */
    public ByteBuffer UTF8(CharSequence text) {
        return UTF8(text, true);
    }

    /**
     * Encodes the specified text on the stack using UTF8 encoding and returns a ByteBuffer that points to the encoded text.
     *
     * @param text           the text to encode. If {@code text} is null, null is returned.
     * @param nullTerminated if true, a null-terminator is included at the end of the encoded text
     */
    public ByteBuffer UTF8(CharSequence text, boolean nullTerminated) {
        if (text == null) {
            return null;
        }

        ByteBuffer encoded = malloc(memLengthUTF8(text, nullTerminated));
        memUTF8(text, nullTerminated, encoded);
        return encoded;
    }

    /**
     * Encodes the specified text on the stack using UTF16 encoding and returns a ByteBuffer that points to the encoded text, including a null-terminator.
     *
     * @param text the text to encode. If {@code text} is null, null is returned.
     */
    public ByteBuffer UTF16(CharSequence text) {
        return UTF16(text, true);
    }

    /**
     * Encodes the specified text on the stack using UTF16 encoding and returns a ByteBuffer that points to the encoded text.
     *
     * @param text           the text to encode. If {@code text} is null, null is returned.
     * @param nullTerminated if true, a null-terminator is included at the end of the encoded text
     */
    public ByteBuffer UTF16(CharSequence text, boolean nullTerminated) {
        if (text == null) {
            return null;
        }

        ByteBuffer encoded = malloc(2, memLengthUTF16(text, nullTerminated));
        memUTF16(text, nullTerminated, encoded);
        return encoded;
    }

    // -----------------------------------------------------
    // -----------------------------------------------------
    // -----------------------------------------------------

    /** Returns the stack of the current thread. */
    public static MemoryStack stackGet() {
        return TLS.get();
    }

    /**
     * Calls {@link #push} on the stack of the current thread.
     *
     * @return the stack of the current thread.
     */
    public static MemoryStack stackPush() {
        return stackGet().push();
    }

    /**
     * Calls {@link #pop} on the stack of the current thread.
     *
     * @return the stack of the current thread.
     */
    public static MemoryStack stackPop() {
        return stackGet().pop();
    }

    /** Thread-local version of {@link #nmalloc(int)}. */
    public static long nstackMalloc(int size) { return stackGet().nmalloc(size); }
    /** Thread-local version of {@link #nmalloc(int, int)}. */
    public static long nstackMalloc(int alignment, int size) { return stackGet().nmalloc(alignment, size); }
    /** Thread-local version of {@link #ncalloc}. */
    public static long nstackCalloc(int alignment, int num, int size) { return stackGet().ncalloc(alignment, num, size); }

    // -------------------------------------------------

    /** Thread-local version of {@link #malloc}. */
    public static ByteBuffer stackMalloc(int size) { return stackGet().malloc(size); }
    /** Thread-local version of {@link #calloc}. */
    public static ByteBuffer stackCalloc(int size) { return stackGet().calloc(size); }

    /** Thread-local version of {@link #bytes(byte)}. */
    public static ByteBuffer stackBytes(byte x) { return stackGet().bytes(x); }
    /** Thread-local version of {@link #bytes(byte, byte)}. */
    public static ByteBuffer stackBytes(byte x, byte y) { return stackGet().bytes(x, y); }
    /** Thread-local version of {@link #bytes(byte, byte, byte)}. */
    public static ByteBuffer stackBytes(byte x, byte y, byte z) { return stackGet().bytes(x, y, z); }
    /** Thread-local version of {@link #bytes(byte, byte, byte, byte)}. */
    public static ByteBuffer stackBytes(byte x, byte y, byte z, byte w) { return stackGet().bytes(x, y, z, w); }
    /** Thread-local version of {@link #bytes(byte...)}. */
    public static ByteBuffer stackBytes(byte... values) { return stackGet().bytes(values); }

    // -------------------------------------------------

    /** Thread-local version of {@link #mallocShort}. */
    public static ShortBuffer stackMallocShort(int size) { return stackGet().mallocShort(size); }
    /** Thread-local version of {@link #callocShort}. */
    public static ShortBuffer stackCallocShort(int size) { return stackGet().callocShort(size); }

    /** Thread-local version of {@link #shorts(short)}. */
    public static ShortBuffer stackShorts(short x) { return stackGet().shorts(x); }
    /** Thread-local version of {@link #shorts(short, short)}. */
    public static ShortBuffer stackShorts(short x, short y) { return stackGet().shorts(x, y); }
    /** Thread-local version of {@link #shorts(short, short, short)}. */
    public static ShortBuffer stackShorts(short x, short y, short z) { return stackGet().shorts(x, y, z); }
    /** Thread-local version of {@link #shorts(short, short, short, short)}. */
    public static ShortBuffer stackShorts(short x, short y, short z, short w) { return stackGet().shorts(x, y, z, w); }
    /** Thread-local version of {@link #shorts(short...)}. */
    public static ShortBuffer stackShorts(short... values) { return stackGet().shorts(values); }

    // -------------------------------------------------

    /** Thread-local version of {@link #mallocInt}. */
    public static IntBuffer stackMallocInt(int size) { return stackGet().mallocInt(size); }
    /** Thread-local version of {@link #callocInt}. */
    public static IntBuffer stackCallocInt(int size) { return stackGet().callocInt(size); }

    /** Thread-local version of {@link #ints(int)}. */
    public static IntBuffer stackInts(int x) { return stackGet().ints(x); }
    /** Thread-local version of {@link #ints(int, int)}. */
    public static IntBuffer stackInts(int x, int y) { return stackGet().ints(x, y); }
    /** Thread-local version of {@link #ints(int, int, int)}. */
    public static IntBuffer stackInts(int x, int y, int z) { return stackGet().ints(x, y, z); }
    /** Thread-local version of {@link #ints(int, int, int, int)}. */
    public static IntBuffer stackInts(int x, int y, int z, int w) { return stackGet().ints(x, y, z, w); }
    /** Thread-local version of {@link #ints(int...)}. */
    public static IntBuffer stackInts(int... values) { return stackGet().ints(values); }

    // -------------------------------------------------

    /** Thread-local version of {@link #mallocLong}. */
    public static LongBuffer stackMallocLong(int size) { return stackGet().mallocLong(size); }
    /** Thread-local version of {@link #callocLong}. */
    public static LongBuffer stackCallocLong(int size) { return stackGet().callocLong(size); }

    /** Thread-local version of {@link #longs(long)}. */
    public static LongBuffer stackLongs(long x) { return stackGet().longs(x); }
    /** Thread-local version of {@link #longs(long, long)}. */
    public static LongBuffer stackLongs(long x, long y) { return stackGet().longs(x, y); }
    /** Thread-local version of {@link #longs(long, long, long)}. */
    public static LongBuffer stackLongs(long x, long y, long z) { return stackGet().longs(x, y, z); }
    /** Thread-local version of {@link #longs(long, long, long, long)}. */
    public static LongBuffer stackLongs(long x, long y, long z, long w) { return stackGet().longs(x, y, z, w); }
    /** Thread-local version of {@link #longs(long...)}. */
    public static LongBuffer stackLongs(long... values) { return stackGet().longs(values); }

    // -------------------------------------------------

    /** Thread-local version of {@link #mallocFloat}. */
    public static FloatBuffer stackMallocFloat(int size) { return stackGet().mallocFloat(size); }
    /** Thread-local version of {@link #callocFloat}. */
    public static FloatBuffer stackCallocFloat(int size) { return stackGet().callocFloat(size); }

    /** Thread-local version of {@link #floats(float)}. */
    public static FloatBuffer stackFloats(float x) { return stackGet().floats(x); }
    /** Thread-local version of {@link #floats(float, float)}. */
    public static FloatBuffer stackFloats(float x, float y) { return stackGet().floats(x, y); }
    /** Thread-local version of {@link #floats(float, float, float)}. */
    public static FloatBuffer stackFloats(float x, float y, float z) { return stackGet().floats(x, y, z); }
    /** Thread-local version of {@link #floats(float, float, float, float)}. */
    public static FloatBuffer stackFloats(float x, float y, float z, float w) { return stackGet().floats(x, y, z, w); }
    /** Thread-local version of {@link #floats(float...)}. */
    public static FloatBuffer stackFloats(float... values) { return stackGet().floats(values); }

    // -------------------------------------------------

    /** Thread-local version of {@link #mallocDouble}. */
    public static DoubleBuffer stackMallocDouble(int size) { return stackGet().mallocDouble(size); }
    /** Thread-local version of {@link #callocDouble}. */
    public static DoubleBuffer stackCallocDouble(int size) { return stackGet().callocDouble(size); }

    /** Thread-local version of {@link #doubles(double)}. */
    public static DoubleBuffer stackDoubles(double x) { return stackGet().doubles(x); }
    /** Thread-local version of {@link #doubles(double, double)}. */
    public static DoubleBuffer stackDoubles(double x, double y) { return stackGet().doubles(x, y); }
    /** Thread-local version of {@link #doubles(double, double, double)}. */
    public static DoubleBuffer stackDoubles(double x, double y, double z) { return stackGet().doubles(x, y, z); }
    /** Thread-local version of {@link #doubles(double, double, double, double)}. */
    public static DoubleBuffer stackDoubles(double x, double y, double z, double w) { return stackGet().doubles(x, y, z, w); }
    /** Thread-local version of {@link #doubles(double...)}. */
    public static DoubleBuffer stackDoubles(double... values) { return stackGet().doubles(values); }

    // -------------------------------------------------

    /** Thread-local version of {@link #mallocPointer}. */
    public static PointerBuffer stackMallocPointer(int size) { return stackGet().mallocPointer(size); }
    /** Thread-local version of {@link #callocPointer}. */
    public static PointerBuffer stackCallocPointer(int size) { return stackGet().callocPointer(size); }

    /** Thread-local version of {@link #pointers(long)}. */
    public static PointerBuffer stackPointers(long x) { return stackGet().pointers(x); }
    /** Thread-local version of {@link #pointers(long, long)}. */
    public static PointerBuffer stackPointers(long x, long y) { return stackGet().pointers(x, y); }
    /** Thread-local version of {@link #pointers(long, long, long)}. */
    public static PointerBuffer stackPointers(long x, long y, long z) { return stackGet().pointers(x, y, z); }
    /** Thread-local version of {@link #pointers(long, long, long, long)}. */
    public static PointerBuffer stackPointers(long x, long y, long z, long w) { return stackGet().pointers(x, y, z, w); }
    /** Thread-local version of {@link #pointers(long...)}. */
    public static PointerBuffer stackPointers(long... values) { return stackGet().pointers(values); }

    /** Thread-local version of {@link #pointers(Pointer)}. */
    public static PointerBuffer stackPointers(Pointer x) { return stackGet().pointers(x); }
    /** Thread-local version of {@link #pointers(Pointer, Pointer)}. */
    public static PointerBuffer stackPointers(Pointer x, Pointer y) { return stackGet().pointers(x, y); }
    /** Thread-local version of {@link #pointers(Pointer, Pointer, Pointer)}. */
    public static PointerBuffer stackPointers(Pointer x, Pointer y, Pointer z) { return stackGet().pointers(x, y, z); }
    /** Thread-local version of {@link #pointers(Pointer, Pointer, Pointer, Pointer)}. */
    public static PointerBuffer stackPointers(Pointer x, Pointer y, Pointer z, Pointer w) { return stackGet().pointers(x, y, z, w); }
    /** Thread-local version of {@link #pointers(Pointer...)}. */
    public static PointerBuffer stackPointers(Pointer... values) { return stackGet().pointers(values); }

    // -------------------------------------------------

    /** Thread-local version of {@link #ASCII(CharSequence)}. */
    public static ByteBuffer stackASCII(CharSequence text) { return stackGet().ASCII(text); }

    /** Thread-local version of {@link #ASCII(CharSequence, boolean)}. */
    public static ByteBuffer stackASCII(CharSequence text, boolean nullTerminated) { return stackGet().ASCII(text, nullTerminated); }

    /** Thread-local version of {@link #UTF8(CharSequence)}. */
    public static ByteBuffer stackUTF8(CharSequence text) { return stackGet().UTF8(text); }

    /** Thread-local version of {@link #UTF8(CharSequence, boolean)}. */
    public static ByteBuffer stackUTF8(CharSequence text, boolean nullTerminated) { return stackGet().UTF8(text, nullTerminated); }

    /** Thread-local version of {@link #UTF16(CharSequence)}. */
    public static ByteBuffer stackUTF16(CharSequence text) { return stackGet().UTF16(text); }

    /** Thread-local version of {@link #UTF16(CharSequence, boolean)}. */
    public static ByteBuffer stackUTF16(CharSequence text, boolean nullTerminated) { return stackGet().UTF16(text, nullTerminated); }

}