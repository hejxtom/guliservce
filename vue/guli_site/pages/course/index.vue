<template>
  <div id="aCoursesList" class="bg-fa of">
    <!-- 课程列表 开始 -->
    <section class="container">
      <header class="comm-title">
        <h2 class="fl tac">
          <span class="c-333">全部课程</span>
        </h2>
      </header>
      <section class="c-sort-box">
        <section class="c-s-dl">
          <dl>
            <dt>
              <span class="c-999 fsize14">课程类别</span>
            </dt>
            <dd class="c-s-dl-li">
              <!-- 一级类别 开始-->
              <ul class="clearfix">
                <li>
                  <a
                    title="全部"
                    href="javascript:void(0);">全部</a>
                </li>
                <li class="current">
                  <a
                    title="后端开发"
                    href="javascript:void(0);">后端开发</a>
                </li>
                <li>
                  <a
                    title="前端开发"
                    href="javascript:void(0);">前端开发</a>
                </li>
                <li>
                  <a
                    title="云计算"
                    href="javascript:void(0);">云计算</a>
                </li>
                <li>
                  <a
                    title="数据库"
                    href="javascript:void(0);">数据库</a>
                </li>
              </ul>
              <!-- /一级类别 结束-->
            </dd>
          </dl>
          <dl>
            <dt>
              <span class="c-999 fsize14"/>
            </dt>
            <dd class="c-s-dl-li">
              <!-- 二级类别 开始-->
              <ul class="clearfix">
                <li class="current">
                  <a
                    title="全部"
                    href="javascript:void(0);">全部</a>
                </li>
                <li>
                  <a
                    title="Java"
                    href="javascript:void(0);">Java</a>
                </li>
                <li>
                  <a
                    title="Python"
                    href="javascript:void(0);">Python</a>
                </li>
              </ul>
              <!-- /二级类别 结束-->
            </dd>
          </dl>
          <div class="clear"/>
        </section>
        <div class="js-wrap">
          <section class="fr">
            <span class="c-ccc">
              <i class="c-master f-fM">1</i>/
              <i class="c-666 f-fM">1</i>
            </span>
          </section>
          <section class="fl">
            <!-- 排序 开始-->
            <ol class="js-tap clearfix">
              <li class="current bg-green">
                <a title="销量" href="javascript:void(0);">销量
                  <i>↓</i>
                </a>
              </li>
              <li>
                <a title="最新" href="javascript:void(0);">最新
                </a>
              </li>
              <li>
                <a title="价格" href="javascript:void(0);">价格
                </a>
              </li>
            </ol>
            <!-- /排序 结束-->
          </section>
        </div>
        <div class="mt40">
          <!-- /无数据提示 开始-->
          <section class="no-data-wrap">
            <em class="icon30 no-data-ico">&nbsp;</em>
            <span class="c-666 fsize14 ml10 vam">没有相关数据，小编正在努力整理中...</span>
          </section>
          <!-- /无数据提示 结束-->

          <!-- 数据列表 开始-->
          <article class="comm-course-list">
            <ul id="bna" class="of">
              <li>
                <div class="cc-l-wrap">
                  <section class="course-img">
                    <img alt="30天搞定Java核心技术" src="~/assets/photo/course/01.jpg" class="img-responsive">
                    <div class="cc-mask">
                      <a href="/course/1" title="开始学习" class="comm-btn c-btn-1">开始学习</a>
                    </div>
                  </section>
                  <h3 class="hLh30 txtOf mt10">
                    <a href="/course/1" title="30天搞定Java核心技术" class="course-title fsize18 c-333">30天搞定Java核心技术</a>
                  </h3>
                  <section class="mt10 hLh20 of">
                    <span class="fr jgTag bg-green">
                      <i class="c-fff fsize12 f-fA">免费</i>
                    </span>
                    <!-- <span class="fr jgTag ">
                      <i class="c-orange fsize12 f-fA"> ￥99</i>
                    </span> -->
                    <span class="fl jgAttr c-ccc f-fA">
                      <i class="c-999 f-fA">100人学习</i>
                      |
                      <i class="c-999 f-fA">100人购买</i>
                    </span>
                  </section>
                </div>
              </li>
              <li>
                <div class="cc-l-wrap">
                  <section class="course-img">
                    <img alt="Linux集群教程" src="~/assets/photo/course/02.jpg" class="img-responsive">
                    <div class="cc-mask">
                      <a href="/course/1" title="开始学习" class="comm-btn c-btn-1">开始学习</a>
                    </div>
                  </section>
                  <h3 class="hLh30 txtOf mt10">
                    <a href="/course/1" title="Linux集群教程" class="course-title fsize18 c-333">Linux集群教程</a>
                  </h3>
                  <section class="mt10 hLh20 of">
                    <span class="fr jgTag ">
                      <i class="c-orange fsize12 f-fA"> ￥99</i>
                    </span>
                    <span class="fl jgAttr c-ccc f-fA">
                      <i class="c-999 f-fA">100人学习</i>
                      |
                      <i class="c-999 f-fA">100人购买</i>
                    </span>
                  </section>
                </div>
              </li>
              <li>
                <div class="cc-l-wrap">
                  <section class="course-img">
                    <img alt="互联网大厂高频重点面试题（第2季）" src="~/assets/photo/course/03.jpg" class="img-responsive">
                    <div class="cc-mask">
                      <a href="/course/1" title="开始学习" class="comm-btn c-btn-1">开始学习</a>
                    </div>
                  </section>
                  <h3 class="hLh30 txtOf mt10">
                    <a href="/course/1" title="互联网大厂高频重点面试题（第2季）" class="course-title fsize18 c-333">互联网大厂高频重点面试题（第2季）</a>
                  </h3>
                  <section class="mt10 hLh20 of">
                    <span class="fr jgTag ">
                      <i class="c-orange fsize12 f-fA"> ￥99</i>
                    </span>
                    <span class="fl jgAttr c-ccc f-fA">
                      <i class="c-999 f-fA">100人学习</i>
                      |
                      <i class="c-999 f-fA">100人购买</i>
                    </span>
                  </section>
                </div>
              </li>
              <li>
                <div class="cc-l-wrap">
                  <section class="course-img">
                    <img alt="RBAC权限模型" src="~/assets/photo/course/04.jpg" class="img-responsive">
                    <div class="cc-mask">
                      <a href="/course/1" title="开始学习" class="comm-btn c-btn-1">开始学习</a>
                    </div>
                  </section>
                  <h3 class="hLh30 txtOf mt10">
                    <a href="/course/1" title="RBAC权限模型" class="course-title fsize18 c-333">RBAC权限模型</a>
                  </h3>
                  <section class="mt10 hLh20 of">
                    <span class="fr jgTag ">
                      <i class="c-orange fsize12 f-fA"> ￥99</i>
                    </span>
                    <span class="fl jgAttr c-ccc f-fA">
                      <i class="c-999 f-fA">100人学习</i>
                      |
                      <i class="c-999 f-fA">100人购买</i>
                    </span>
                  </section>
                </div>
              </li>
              <li>
                <div class="cc-l-wrap">
                  <section class="course-img">
                    <img alt="SpringMVC" src="~/assets/photo/course/05.jpg" class="img-responsive">
                    <div class="cc-mask">
                      <a href="/course/1" title="开始学习" class="comm-btn c-btn-1">开始学习</a>
                    </div>
                  </section>
                  <h3 class="hLh30 txtOf mt10">
                    <a href="/course/1" title="SpringMVC" class="course-title fsize18 c-333">SpringMVC</a>
                  </h3>
                  <section class="mt10 hLh20 of">
                    <span class="fr jgTag ">
                      <i class="c-orange fsize12 f-fA"> ￥99</i>
                    </span>
                    <span class="fl jgAttr c-ccc f-fA">
                      <i class="c-999 f-fA">100人学习</i>
                      |
                      <i class="c-999 f-fA">100人购买</i>
                    </span>
                  </section>
                </div>
              </li>
              <li>
                <div class="cc-l-wrap">
                  <section class="course-img">
                    <img alt="图解Java数据结构和算法" src="~/assets/photo/course/06.jpg" class="img-responsive">
                    <div class="cc-mask">
                      <a href="/course/1" title="开始学习" class="comm-btn c-btn-1">开始学习</a>
                    </div>
                  </section>
                  <h3 class="hLh30 txtOf mt10">
                    <a href="/course/1" title="图解Java数据结构和算法" class="course-title fsize18 c-333">图解Java数据结构和算法</a>
                  </h3>
                  <section class="mt10 hLh20 of">
                    <span class="fr jgTag ">
                      <i class="c-orange fsize12 f-fA"> ￥99</i>
                    </span>
                    <span class="fl jgAttr c-ccc f-fA">
                      <i class="c-999 f-fA">100人学习</i>
                      |
                      <i class="c-999 f-fA">100人购买</i>
                    </span>
                  </section>
                </div>
              </li>
              <li>
                <div class="cc-l-wrap">
                  <section class="course-img">
                    <img alt="IT人面试求职技巧" src="~/assets/photo/course/07.jpg" class="img-responsive">
                    <div class="cc-mask">
                      <a href="/course/1" title="开始学习" class="comm-btn c-btn-1">开始学习</a>
                    </div>
                  </section>
                  <h3 class="hLh30 txtOf mt10">
                    <a href="/course/1" title="IT人面试求职技巧" class="course-title fsize18 c-333">IT人面试求职技巧</a>
                  </h3>
                  <section class="mt10 hLh20 of">
                    <span class="fr jgTag ">
                      <i class="c-orange fsize12 f-fA"> ￥99</i>
                    </span>
                    <span class="fl jgAttr c-ccc f-fA">
                      <i class="c-999 f-fA">100人学习</i>
                      |
                      <i class="c-999 f-fA">100人购买</i>
                    </span>
                  </section>
                </div>
              </li>
              <li>
                <div class="cc-l-wrap">
                  <section class="course-img">
                    <img alt="Java11新特性教程" src="~/assets/photo/course/08.jpg" class="img-responsive">
                    <div class="cc-mask">
                      <a href="/course/1" title="开始学习" class="comm-btn c-btn-1">开始学习</a>
                    </div>
                  </section>
                  <h3 class="hLh30 txtOf mt10">
                    <a href="/course/1" title="Java11新特性教程" class="course-title fsize18 c-333">Java11新特性教程</a>
                  </h3>
                  <section class="mt10 hLh20 of">
                    <span class="fr jgTag ">
                      <i class="c-orange fsize12 f-fA"> ￥99</i>
                    </span>
                    <span class="fl jgAttr c-ccc f-fA">
                      <i class="c-999 f-fA">100人学习</i>
                      |
                      <i class="c-999 f-fA">100人购买</i>
                    </span>
                  </section>
                </div>
              </li>
            </ul>
            <div class="clear"/>
          </article>
          <!-- /数据列表 结束-->
        </div>
      </section>
    </section>
    <!-- /课程列表 结束 -->
  </div>
</template>
