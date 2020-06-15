package pl.faldrow.springbootrestclient.converter;

import java.util.*;

/**
 * Created by Artur on 11.06.2020.
 */

public abstract class SimpleConverterTemplate<S, T> {

    public abstract T convert(S source, Map<String, Object> parameters);

    public abstract void convertInternal(T target, S source, Map<String, Object> parameters);

    public void convertInternal(T target, S source) {
        this.convertInternal(target, source, new HashMap<>());
    }

    public T convertNullable(S source, Map<String, Object> parameters) {
        if (source == null) {
            return null;
        }

        return this.convert(source, parameters);
    }

    public T convert(S source) {
        return (T) this.convert(source, new HashMap<>());
    }

    public T convertNullable(S source) {
        if (source == null) {
            return null;
        }

        return this.convert(source);
    }

    public Set<T> convert(Iterable<S> sourceIterable, Map<String, Object> parameters) {
        if (sourceIterable != null && sourceIterable.iterator().hasNext()) {
            Set<T> result = new LinkedHashSet<T>();

            for (S elem : sourceIterable) {
                addNotNull(result, this.convert(elem, parameters));
            }

            return result;
        } else {
            return null;
        }
    }

    public Set<T> convertDefaultEmpty(Iterable<S> sourceIterable, Map<String, Object> parameters) {
        Set<T> converted = this.convert(sourceIterable, parameters);
        return converted != null ? converted : new HashSet<T>();
    }

    public List<T> convertToList(Iterable<S> sourceIterable, Map<String, Object> parameters) {
        Set<T> converted = this.convert(sourceIterable, parameters);
        return converted != null && !converted.isEmpty() ? new ArrayList<T>(converted) : null;
    }

    public List<T> convertToListDefaultEmpty(Iterable<S> sourceIterable, Map<String, Object> parameters) {
        List<T> converted = this.convertToList(sourceIterable, parameters);
        return converted != null ? converted : new ArrayList<T>();
    }

    private void addNotNull(Set<T> target, T item) {
        if (item != null) {
            target.add(item);
        }
    }
}

