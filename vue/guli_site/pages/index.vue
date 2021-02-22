<template>

  <div>
    <!-- 幻灯片 开始 -->
    <div v-swiper:mySwiper="swiperOption">
      <div class="swiper-wrapper">
        <div class="swiper-slide" style="background: #040B1B;">
          <a target="_blank" href="/">
            <img src="~/assets/photo/banner/1525939573202.jpg" alt="首页banner">
          </a>
        </div>
        <div class="swiper-slide" style="background: #040B1B;">
          <a target="_blank" href="/">
            <img src="~/assets/photo/banner/1525939573202.jpg" alt="首页banner">
          </a>
        </div>
      </div>
      <div class="swiper-pagination swiper-pagination-white"/>
      <div slot="button-prev" class="swiper-button-prev swiper-button-white"/>
      <div slot="button-next" class="swiper-button-next swiper-button-white"/>
    </div>
    <!-- 幻灯片 结束 -->

    <div id="aCoursesList">
      <!-- 网校课程 开始 -->
      <div>
        <section class="container">
          <header class="comm-title">
            <h2 class="tac">
              <span class="c-333">热门课程</span>
            </h2>
          </header>
          <div>
            <article class="comm-course-list">
              <ul id="bna" class="of">
                <li>
                  <div class="cc-l-wrap">
                    <section class="course-img">
                      <img
                        src="~/assets/photo/course/01.jpg"
                        class="img-responsive"
                        alt="听力口语"
                      >
                      <div class="cc-mask">
                        <a href="#" title="开始学习" class="comm-btn c-btn-1">开始学习</a>
                      </div>
                    </section>
                    <h3 class="hLh30 txtOf mt10">
                      <a href="#" title="听力口语" class="course-title fsize18 c-333">听力口语</a>
                    </h3>
                    <section class="mt10 hLh20 of">
                      <span class="fr jgTag bg-green">
                        <i class="c-fff fsize12 f-fA">免费</i>
                      </span>
                      <span class="fl jgAttr c-ccc f-fA">
                        <i class="c-999 f-fA">9634人学习</i>
                        |
                        <i class="c-999 f-fA">9634评论</i>
                      </span>
                    </section>
                  </div>
                </li>
                <li>
                  <div class="cc-l-wrap">
                    <section class="course-img">
                      <img
                        src="~/assets/photo/course/02.jpg"
                        class="img-responsive"
                        alt="Java精品课程"
                      >
                      <div class="cc-mask">
                        <a href="#" title="开始学习" class="comm-btn c-btn-1">开始学习</a>
                      </div>
                    </section>
                    <h3 class="hLh30 txtOf mt10">
                      <a href="#" title="Java精品课程" class="course-title fsize18 c-333">Java精品课程</a>
                    </h3>
                    <section class="mt10 hLh20 of">
                      <span class="fr jgTag bg-green">
                        <i class="c-fff fsize12 f-fA">免费</i>
                      </span>
                      <span class="fl jgAttr c-ccc f-fA">
                        <i class="c-999 f-fA">501人学习</i>
                        |
                        <i class="c-999 f-fA">501评论</i>
                      </span>
                    </section>
                  </div>
                </li>
                <li>
                  <div class="cc-l-wrap">
                    <section class="course-img">
                      <img
                        src="~/assets/photo/course/03.jpg"
                        class="img-responsive"
                        alt="C4D零基础"
                      >
                      <div class="cc-mask">
                        <a href="#" title="开始学习" class="comm-btn c-btn-1">开始学习</a>
                      </div>
                    </section>
                    <h3 class="hLh30 txtOf mt10">
                      <a href="#" title="C4D零基础" class="course-title fsize18 c-333">C4D零基础</a>
                    </h3>
                    <section class="mt10 hLh20 of">
                      <span class="fr jgTag bg-green">
                        <i class="c-fff fsize12 f-fA">免费</i>
                      </span>
                      <span class="fl jgAttr c-ccc f-fA">
                        <i class="c-999 f-fA">300人学习</i>
                        |
                        <i class="c-999 f-fA">300评论</i>
                      </span>
                    </section>
                  </div>
                </li>
                <li>
                  <div class="cc-l-wrap">
                    <section class="course-img">
                      <img
                        src="~/assets/photo/course/04.jpg"
                        class="img-responsive"
                        alt="数学给宝宝带来的兴趣"
                      >
                      <div class="cc-mask">
                        <a href="#" title="开始学习" class="comm-btn c-btn-1">开始学习</a>
                      </div>
                    </section>
                    <h3 class="hLh30 txtOf mt10">
                      <a href="#" title="数学给宝宝带来的兴趣" class="course-title fsize18 c-333">数学给宝宝带来的兴趣</a>
                    </h3>
                    <section class="mt10 hLh20 of">
                      <span class="fr jgTag bg-green">
                        <i class="c-fff fsize12 f-fA">免费</i>
                      </span>
                      <span class="fl jgAttr c-ccc f-fA">
                        <i class="c-999 f-fA">256人学习</i>
                        |
                        <i class="c-999 f-fA">256评论</i>
                      </span>
                    </section>
                  </div>
                </li>
                <li>
                  <div class="cc-l-wrap">
                    <section class="course-img">
                      <img
                        src="~/assets/photo/course/05.jpg"
                        class="img-responsive"
                        alt="零基础入门学习Python课程学习"
                      >
                      <div class="cc-mask">
                        <a href="#" title="开始学习" class="comm-btn c-btn-1">开始学习</a>
                      </div>
                    </section>
                    <h3 class="hLh30 txtOf mt10">
                      <a
                        href="#"
                        title="零基础入门学习Python课程学习"
                        class="course-title fsize18 c-333"
                      >零基础入门学习Python课程学习</a>
                    </h3>
                    <section class="mt10 hLh20 of">
                      <span class="fr jgTag bg-green">
                        <i class="c-fff fsize12 f-fA">免费</i>
                      </span>
                      <span class="fl jgAttr c-ccc f-fA">
                        <i class="c-999 f-fA">137人学习</i>
                        |
                        <i class="c-999 f-fA">137评论</i>
                      </span>
                    </section>
                  </div>
                </li>
                <li>
                  <div class="cc-l-wrap">
                    <section class="course-img">
                      <img
                        src="~/assets/photo/course/06.jpg"
                        class="img-responsive"
                        alt="MySql从入门到精通"
                      >
                      <div class="cc-mask">
                        <a href="#" title="开始学习" class="comm-btn c-btn-1">开始学习</a>
                      </div>
                    </section>
                    <h3 class="hLh30 txtOf mt10">
                      <a href="#" title="MySql从入门到精通" class="course-title fsize18 c-333">MySql从入门到精通</a>
                    </h3>
                    <section class="mt10 hLh20 of">
                      <span class="fr jgTag bg-green">
                        <i class="c-fff fsize12 f-fA">免费</i>
                      </span>
                      <span class="fl jgAttr c-ccc f-fA">
                        <i class="c-999 f-fA">125人学习</i>
                        |
                        <i class="c-999 f-fA">125评论</i>
                      </span>
                    </section>
                  </div>
                </li>
                <li>
                  <div class="cc-l-wrap">
                    <section class="course-img">
                      <img
                        src="~/assets/photo/course/07.jpg"
                        class="img-responsive"
                        alt="搜索引擎优化技术"
                      >
                      <div class="cc-mask">
                        <a href="#" title="开始学习" class="comm-btn c-btn-1">开始学习</a>
                      </div>
                    </section>
                    <h3 class="hLh30 txtOf mt10">
                      <a href="#" title="搜索引擎优化技术" class="course-title fsize18 c-333">搜索引擎优化技术</a>
                    </h3>
                    <section class="mt10 hLh20 of">
                      <span class="fr jgTag bg-green">
                        <i class="c-fff fsize12 f-fA">免费</i>
                      </span>
                      <span class="fl jgAttr c-ccc f-fA">
                        <i class="c-999 f-fA">123人学习</i>
                        |
                        <i class="c-999 f-fA">123评论</i>
                      </span>
                    </section>
                  </div>
                </li>
                <li>
                  <div class="cc-l-wrap">
                    <section class="course-img">
                      <img
                        src="~/assets/photo/course/08.jpg"
                        class="img-responsive"
                        alt="20世纪西方音乐"
                      >
                      <div class="cc-mask">
                        <a href="#" title="开始学习" class="comm-btn c-btn-1">开始学习</a>
                      </div>
                    </section>
                    <h3 class="hLh30 txtOf mt10">
                      <a href="#" title="20世纪西方音乐" class="course-title fsize18 c-333">20世纪西方音乐</a>
                    </h3>
                    <section class="mt10 hLh20 of">
                      <span class="fr jgTag bg-green">
                        <i class="c-fff fsize12 f-fA">免费</i>
                      </span>
                      <span class="fl jgAttr c-ccc f-fA">
                        <i class="c-999 f-fA">34人学习</i>
                        |
                        <i class="c-999 f-fA">34评论</i>
                      </span>
                    </section>
                  </div>
                </li>
              </ul>
              <div class="clear"/>
            </article>
            <section class="tac pt20">
              <a href="#" title="全部课程" class="comm-btn c-btn-2">全部课程</a>
            </section>
          </div>
        </section>
      </div>
      <!-- /网校课程 结束 -->
      <!-- 网校名师 开始 -->
      <div>
        <section class="container">
          <header class="comm-title">
            <h2 class="tac">
              <span class="c-333">名师大咖</span>
            </h2>
          </header>
          <div>
            <article class="i-teacher-list">
              <ul class="of">
                <li>
                  <section class="i-teach-wrap">
                    <div class="i-teach-pic">
                      <a href="/teacher/1" title="陈伟霆">
                        <img alt="陈伟霆" src="~/assets/photo/teacher/04.jpg" width="142">
                      </a>
                    </div>
                    <div class="mt10 hLh30 txtOf tac">
                      <a href="/teacher/1" title="陈伟霆" class="fsize18 c-666">陈伟霆</a>
                    </div>
                  </section>
                </li>
                <li>
                  <section class="i-teach-wrap">
                    <div class="i-teach-pic">
                      <a href="/teacher/1" title="周润发">
                        <img alt="周润发" src="~/assets/photo/teacher/01.jpg" width="142">
                      </a>
                    </div>
                    <div class="mt10 hLh30 txtOf tac">
                      <a href="/teacher/1" title="周润发" class="fsize18 c-666">周润发</a>
                    </div>
                  </section>
                </li>
                <li>
                  <section class="i-teach-wrap">
                    <div class="i-teach-pic">
                      <a href="/teacher/1" title="周杰伦">
                        <img alt="周杰伦" src="~/assets/photo/teacher/02.jpg" width="142">
                      </a>
                    </div>
                    <div class="mt10 hLh30 txtOf tac">
                      <a href="/teacher/1" title="周杰伦" class="fsize18 c-666">周杰伦</a>
                    </div>
                  </section>
                </li>
                <li>
                  <section class="i-teach-wrap">
                    <div class="i-teach-pic">
                      <a href="/teacher/1" title="刘德华">
                        <img alt="刘德华" src="~/assets/photo/teacher/03.jpg" width="142">
                      </a>
                    </div>
                    <div class="mt10 hLh30 txtOf tac">
                      <a href="/teacher/1" title="刘德华" class="fsize18 c-666">刘德华</a>
                    </div>
                  </section>
                </li>
              </ul>
              <div class="clear"/>
            </article>
            <section class="tac pt20">
              <a href="teacher" title="全部讲师" class="comm-btn c-btn-2">全部讲师</a>
            </section>
          </div>
        </section>
      </div>
      <!-- /网校名师 结束 -->
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      swiperOption: {
        // 配置分页
        pagination: {
          el: '.swiper-pagination'// 分页的dom节点
        },
        // 配置导航
        navigation: {
          nextEl: '.swiper-button-next', // 下一页dom节点
          prevEl: '.swiper-button-prev'// 前一页dom节点
        }
      }
    }
  }
}
</script>
