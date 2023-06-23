package maven.bugs.internal;

import com.google.inject.Provider;

public final class InternalImportBindingBuilder {

    static final class InternalBindingProvider<T> implements Provider<T> {

        @Override
        public T get() {
            return null;
        }
    }
}
