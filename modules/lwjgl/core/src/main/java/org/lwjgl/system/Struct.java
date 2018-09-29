/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import javax.annotation.*;
import java.nio.*;
import java.util.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Base class of all struct implementations. */
public abstract class Struct extends Pointer.Default {

    private static final long CONTAINER;

    static {
        Library.initialize();

        try {
            CONTAINER = UNSAFE.objectFieldOffset(Struct.class.getDeclaredField("container"));
        } catch (Throwable t) {
            throw new UnsupportedOperationException(t);
        }
    }

    @SuppressWarnings({"unused", "FieldCanBeLocal"})
    @Nullable
    private ByteBuffer container;

    protected Struct(long address, @Nullable ByteBuffer container) {
        super(address);
        this.container = container;
    }

    /** Returns {@code sizeof(struct)}. */
    public abstract int sizeof();

    /** Zeroes-out the struct data. */
    public void clear() {
        memSet(address(), 0, sizeof());
    }

    /**
     * Frees the struct allocation.
     *
     * <p>This method should not be used if the memory backing this struct is not owned by the struct.</p>
     */
    public void free() {
        nmemFree(address());
    }

    /**
     * Returns true if the pointer member that corresponds to the specified {@code memberOffset} is {@code NULL}.
     *
     * <p>This is useful to verify that not nullable members of an untrusted struct instance are indeed not {@code NULL}.</p>
     *
     * @param memberOffset the byte offset of the member to query
     *
     * @return true if the member is {@code NULL}
     */
    public boolean isNull(int memberOffset) {
        if (DEBUG) {
            checkMemberOffset(memberOffset);
        }
        return memGetAddress(address() + memberOffset) == NULL;
    }

    // ---------------- Implementation utilities ----------------

    @SuppressWarnings("unchecked")
    protected static <T extends Struct> T wrap(Class<T> clazz, long address) {
        T struct;
        try {
            struct = (T)UNSAFE.allocateInstance(clazz);
        } catch (InstantiationException e) {
            throw new UnsupportedOperationException(e);
        }

        UNSAFE.putLong(struct, ADDRESS, address);

        return struct;
    }

    @SuppressWarnings("unchecked")
    protected static <T extends Struct> T wrap(Class<T> clazz, long address, ByteBuffer container) {
        T struct;
        try {
            struct = (T)UNSAFE.allocateInstance(clazz);
        } catch (InstantiationException e) {
            throw new UnsupportedOperationException(e);
        }

        UNSAFE.putLong(struct, ADDRESS, address);
        UNSAFE.putObject(struct, CONTAINER, container);

        return struct;
    }

    @SuppressWarnings("unchecked")
    <T extends Struct> T wrap(long address, int index, @Nullable ByteBuffer container) {
        T struct;
        try {
            struct = (T)UNSAFE.allocateInstance(this.getClass());
        } catch (InstantiationException e) {
            throw new UnsupportedOperationException(e);
        }

        UNSAFE.putLong(struct, ADDRESS, address + Integer.toUnsignedLong(index) * sizeof());
        UNSAFE.putObject(struct, CONTAINER, container);

        return struct;
    }

    private void checkMemberOffset(int memberOffset) {
        if (memberOffset < 0 || sizeof() - memberOffset < POINTER_SIZE) {
            throw new IllegalArgumentException("Invalid member offset.");
        }
    }

    protected static ByteBuffer __checkContainer(ByteBuffer container, int sizeof) {
        if (CHECKS) {
            check(container, sizeof);
        }
        return container;
    }

    private static long getBytes(int elements, int elementSize) {
        return ((long)elements & 0xFFFF_FFFFL) * elementSize;
    }

    protected static long __checkMalloc(int elements, int elementSize) {
        long bytes = ((long)elements & 0xFFFF_FFFFL) * elementSize;
        if (DEBUG) {
            if (elements < 0) {
                throw new IllegalArgumentException("Invalid number of elements");
            }
            if (BITS32 && 0xFFFF_FFFFL < bytes) {
                throw new IllegalArgumentException("The request allocation is too large");
            }
        }
        return bytes;
    }

    protected static ByteBuffer __create(int elements, int elementSize) {
        apiCheckAllocation(elements, getBytes(elements, elementSize), 0x7FFF_FFFFL);
        return ByteBuffer.allocateDirect(elements * elementSize).order(ByteOrder.nativeOrder());
    }

    // ---------------- Struct Member Layout ----------------

    protected static class Member {
        final int size;
        final int alignment;

        int offset;

        protected Member(int size, int alignment) {
            this.size = size;
            this.alignment = alignment;
        }

        public int getSize() {
            return size;
        }

        public int getAlignment() {
            return alignment;
        }
    }

    protected static class Layout extends Member {
        public final Member[] members;

        public Layout(int size, int alignment, Member[] members) {
            super(size, alignment);
            this.members = members;
        }

        public int offsetof(int member) {
            return members[member].offset;
        }
    }

    protected static Member __padding(int size, boolean condition) {
        return __member(condition ? size : 0, 1);
    }

    protected static Member __member(int size) {
        return __member(size, size);
    }

    protected static Member __member(int size, int alignment) {
        return new Member(size, alignment);
    }

    protected static Member __array(int size, int length) {
        return __array(size, size, length);
    }
    protected static Member __array(int size, int alignment, int length) {
        return new Member(size * length, alignment);
    }

    protected static Layout __union(Member... members) {
        List<Member> union = new ArrayList<>(members.length);

        int size      = 0;
        int alignment = 0;
        for (int i = 0; i < members.length; i++) {
            size = Math.max(size, members[i].size);
            alignment = Math.max(alignment, members[i].alignment);

            members[i].offset = 0;
            union.add(members[i]);
            if (members[i] instanceof Layout) {
                addNestedMembers(members[i], union, 0);
            }
        }

        return new Layout(size, alignment, union.toArray(new Member[0]));
    }

    protected static Layout __struct(Member... members) {
        List<Member> struct = new ArrayList<>(members.length);

        int size      = 0;
        int alignment = 0;
        for (int i = 0; i < members.length; i++) {
            Member m = members[i];

            size = (m.offset = align(size, m.alignment)) + m.size;
            alignment = Math.max(alignment, m.alignment);

            struct.add(m);
            if (m instanceof Layout) {
                addNestedMembers(m, struct, m.offset);
            }
        }

        // tail padding
        size = align(size, alignment);

        return new Layout(size, alignment, struct.toArray(new Member[0]));
    }

    private static void addNestedMembers(Member nested, List<Member> members, int offset) {
        Layout layout = (Layout)nested;

        for (Member m : layout.members) {
            m.offset += offset;
            members.add(m);
        }
    }

    private static int align(int offset, int alignment) {
        return ((offset - 1) | (alignment - 1)) + 1;
    }

}