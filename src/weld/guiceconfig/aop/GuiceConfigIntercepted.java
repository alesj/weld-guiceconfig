/*
 * Copyright (C) 2010 Alen Vrecko
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package weld.guiceconfig.aop;

import javax.interceptor.InterceptorBinding;
import java.lang.annotation.*;

/**
 * Marker annotation to hook in {@link GuiceConfigInterceptor} .
 *
 * @author Alen Vrecko
 */
@Retention(RetentionPolicy.RUNTIME)
@InterceptorBinding
@Inherited
@Target({ElementType.METHOD, ElementType.TYPE})
public @interface GuiceConfigIntercepted {
}
