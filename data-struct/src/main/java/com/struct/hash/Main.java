package com.struct.hash;

import java.util.HashMap;
import java.util.Objects;

/**
 * @author lc
 * @since 2022/5/29
 */
public class Main {
    public static void main(String[] args) {
        HashMap<User, String> hash = new HashMap<>();

        for (int i = 0; i < 15; i++) {
            hash.put(new User("i"+i), "H"+i);
           // System.out.println((""+i).hashCode());
        }

        System.out.println(hash.size());

        User a = null;
        User b = a;
        a = new User("x");
        System.out.println(b);
        System.out.println(a);
    }


    static class User {
        private String key;

        public User(String key) {
            this.key = key;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            User user = (User) o;
            return Objects.equals(key, user.key);
        }

        @Override
        public int hashCode() {
            return 0;
        }
    }
}
